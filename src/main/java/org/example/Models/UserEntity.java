package org.example.Models;

public class UserEntity {
    private Long id;
    private String name;
    private String email;
    private String password;

    // Default Constructor
    public UserEntity() {}

    // Parameterized Constructor
    public UserEntity(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
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

    // Login and Logout Methods
    public void login() {
        System.out.println("Welcome, " + name + "! You are now logged in.");
    }

    public void logout() {
        System.out.println("Goodbye, " + name + "! You are now logged out.");
    }

    // Role Validation Methods
    public static boolean adminTrait(String name, String password) {
        return "admin".equals(name) && "admin".equals(password);
    }

    public static boolean studentTrait(String name, String password) {
        return "student".equals(name) && "student".equals(password);
    }

    public static boolean instructorTrait(String name, String password) {
        return "teacher".equals(name) && "teacher".equals(password);
    }

    // Role-Based Validation
    public static String validateRole(String name, String password) {
        if (adminTrait(name, password)) {
            return "Admin";
        } else if (studentTrait(name, password)) {
            return "Student";
        } else if (instructorTrait(name, password)) {
            return "Instructor";
        } else {
            return "Invalid";
        }
    }
}
