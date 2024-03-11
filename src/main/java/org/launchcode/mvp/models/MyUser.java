package org.launchcode.mvp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.apache.catalina.Group;
import org.apache.catalina.Role;

import org.apache.catalina.UserDatabase;

import java.util.Iterator;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")

    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;


    private String role;

    // Default constructor for JPA
    public User() {
    }

    // Constructor with fields
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void addGroup ( Group group ) {

    }

    @Override
    public void addRole ( Role role ) {

    }

    @Override
    public boolean isInGroup ( Group group ) {
        return false;
    }

    @Override
    public boolean isInRole ( Role role ) {
        return false;
    }

    @Override
    public void removeGroup ( Group group ) {

    }

    @Override
    public void removeGroups ( ) {

    }

    @Override
    public void removeRole ( Role role ) {

    }

    @Override
    public void removeRoles ( ) {

    }

    @Override
    public String getFullName ( ) {
        return null;
    }

    @Override
    public void setFullName ( String fullName ) {

    }

    @Override
    public Iterator <Group> getGroups ( ) {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Iterator <Role> getRoles ( ) {
        return null;
    }

    @Override
    public UserDatabase getUserDatabase ( ) {
        return null;
    }

    public String getRole ( ) {
        return role;
    }

    public void setRole ( String role ) {
        this.role = role;
    }

    @Override
    public String getName ( ) {
        return null;
    }

    // Additional methods like equals(), hashCode(), and toString() can be added as needed
}

