package org.example.Service;

import org.example.Models.Administrator;
import org.example.Models.Instructor;
import org.example.Models.Student;
import org.example.Models.UserEntity;

import java.util.Scanner;

public class ClassifyUser {

    public static void verifyUser(Scanner sc) {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String role = UserEntity.validateRole(username, password);

        switch (role) {
            case "Admin" -> handleAdminActions(sc);
            case "Instructor" -> handleInstructorActions(sc);
            case "Student" -> handleStudentActions(sc);
            default -> System.out.println("Invalid credentials. Please try again.");
        }
    }

    private static void handleAdminActions(Scanner sc) {
        System.out.println("Welcome, Admin!");
        while (true) {
            System.out.println("1. Generate Report");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline to prevent input issues

            switch (choice) {
                case 1 -> Administrator.generateReport();
                case 0 -> {
                    System.out.println("Exiting admin panel. Goodbye!");
                    return; // Exit the method cleanly
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void handleInstructorActions(Scanner sc) {
        System.out.println("Welcome, Instructor!");
        while (true) {
            System.out.println("1. Create Course");
            System.out.println("2. Update Course");
            System.out.println("3. Assign Marks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            Instructor instructor = new Instructor();
            switch (choice) {
                case 1 -> instructor.createCourse();
                case 2 -> instructor.updateCourse();
                case 3 -> instructor.assignMarks();
                case 0 -> {
                    System.out.println("Exiting instructor panel. Goodbye!");
                    return; // Exit the method cleanly
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleStudentActions(Scanner sc) {
        System.out.println("Welcome, Student!");
        while (true) {
            System.out.println("1. Track Report");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            Student student = new Student();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your Symbol Number: ");
                    Long symbolNo = sc.nextLong();
                    sc.nextLine(); // Consume newline
                    student.setSymbolNo(symbolNo);
                    student.trackReport(); // Add functionality for tracking reports.
                }
                case 0 -> {
                    System.out.println("Exiting student panel. Goodbye!");
                    return; // Exit the method cleanly
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
