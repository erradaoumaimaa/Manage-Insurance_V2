package com.oumaima.manageinsurance_v2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotEmpty(message = "Name is required")
    @Column(name = "name", nullable = false)
    protected String name;

    @NotEmpty(message = "Address is required")
    @Column(name = "address", nullable = false)
    protected String address;

    @NotEmpty(message = "Phone is required")
    @Column(name = "phone", nullable = false)
    protected String phone;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @Column(name = "email", unique = true, nullable = false, length = 100)
    protected String email;

    @NotEmpty(message = "Password is required")
    @Column(name = "password", nullable = false, length = 255)
    protected String password;

    public User() {}

    public User(String name, String address, String email, String password,String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}