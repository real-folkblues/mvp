//package org.launchcode.mvp.models;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotBlank(message = "Username is required")
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @NotBlank(message = "Password is required")
//    @Size(min = 8, message = "Password must be at least 8 characters long")
//    private String password;
//
//    // Default constructor for JPA
//    public User() {
//    }
//
//    // Constructor with fields
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    // Additional methods like equals(), hashCode(), and toString() can be added as needed
//}
//
