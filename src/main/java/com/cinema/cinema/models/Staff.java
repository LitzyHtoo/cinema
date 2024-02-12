package com.cinema.cinema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staff_id;

    @NotBlank(message = "Name cannot be empty")
    @Size(min =5, max=99,message="Name must be at least 5 characters")
    private String name;
    @NotBlank(message = "Phone cannot be empty")
    @Size(min=7 ,max = 12, message = "Phone number must be at least 7 digits.")
    private String phone;
    @NotBlank(message = "Address cannot be empty")
    private String address;
    @NotBlank(message = "Email cannot be empty")
    @Size(min=5 ,message = "Email cannot be empty")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;
    @NotBlank(message = "Salary cannot be empty")
    private String salary;

}
