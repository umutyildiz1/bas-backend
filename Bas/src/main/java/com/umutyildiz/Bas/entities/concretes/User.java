package com.umutyildiz.Bas.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.umutyildiz.Bas.core.customAnnotations.UniqueEmail;
import com.umutyildiz.Bas.core.customAnnotations.UniquePhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Collection;

@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    @Size(min = 2,max = 50)
    private String userName;

    @Column(name="surname")
    @Size(min = 2,max = 50)
    private String userSurname;


    @UniqueEmail
    @Email
    @Column(name="email",unique = true)
    @Size(min = 2,max = 50)
    private String userEmail;

    @NotBlank
    @Column(name="user_password")
    @Size(min = 2,max = 50)

    private String userPassword;

    //Notnull gelecek
    @Column(name="image_url")
    @Size(min = 2,max = 500) // max num değiştirebilir hem database hem backend
    private  String imageUrl;


    @UniquePhoneNumber
    @Column(name="phone_number")
    @Size(min = 11,max = 11,message = "Boyut 11 karakterli olmalıdır!")
    @Pattern(regexp="(^$|[0-9]{11})",message = "Telefon numarası sayılardan ve 11 karakterden oluşmalıdır!")

    private String userPhoneNumber;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("Role_user");
    }

    @Override
    public String getPassword() {
        return this.getUserPassword();
    }

    @Override
    public String getUsername() {
        return this.getUserEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
