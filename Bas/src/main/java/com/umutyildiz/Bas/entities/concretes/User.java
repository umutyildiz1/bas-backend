package com.umutyildiz.Bas.entities.concretes;

import com.umutyildiz.Bas.core.customAnnotations.UniqueEmail;
import com.umutyildiz.Bas.core.customAnnotations.UniquePhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @NotBlank
    @Column(name="user_name")
    @Size(min = 2,max = 50)
    private String userName;

    @NotBlank
    @Column(name="surname")
    @Size(min = 2,max = 50)
    private String userSurname;

    @NotBlank
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

    @NotBlank
    @UniquePhoneNumber
    @Column(name="phone_number")
    @Pattern(regexp="(^$|[0-9]{11})",message = "Telefon numarası sayılardan oluşmalıdır!")
    @Size(min = 11,max = 11,message = "Boyut 11 karakterli olmalıdır!")
    private String userPhoneNumber;
}
