package org.example.Models;

public class Instructor extends UserEntity {

    public void createCourse() {
        System.out.println("Creating a new course...");
        System.out.println("Course created successfully!");
    }

    public void updateCourse() {
        System.out.println("Updating course details...");
        System.out.println("Course updated successfully!");
    }

    public void assignMarks() {
        System.out.println("Assigning marks to students...");
        System.out.println("Marks assigned successfully!");
    }
}
