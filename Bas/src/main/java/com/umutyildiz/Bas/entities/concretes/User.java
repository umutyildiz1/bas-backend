package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column(name="user_name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email",unique = true)
    private String email;

    @Column(name="user_password")
    private String password;

    @Column(name="image_url")
    private  String imageUrl;

    @Column(name="phone_number",unique = true)
    private String phoneNumber;
}
