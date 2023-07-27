package com.geekster.Recipe_management_system_API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    @Column(nullable = false)
    private String userName;

    @NotBlank
    @Pattern(regexp = "^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$",message = "write an valid Email")
    private String email;

    @NotBlank
    private String password;
}
