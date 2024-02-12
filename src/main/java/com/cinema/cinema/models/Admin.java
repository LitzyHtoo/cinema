package com.cinema.cinema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;
    @NotBlank(message = "Name cannot be empty")
    @Size(min =5, max=99,message="Name must be at least 5 characters")
    private String name;
    @NotBlank(message = "Phone cannot be empty")
    @Size(min =7, max=12,message="Phone number must be at least 7 digits")
    private String phone;
    @NotBlank(message = "Email cannot be empty")
    @Size(min =5, max=99,message="Email must be at least 5 characters")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;

    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
