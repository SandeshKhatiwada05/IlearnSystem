package org.example.Models;

public class Administrator extends UserEntity {

    public static void generateReport() {
        System.out.println("Generating student reports...");
        Student student = new Student();
        student.setName("Sandesh Khatiwada");
        student.setGpa(3.8f);
        System.out.println("Student: " + student.getName() + " | GPA: " + student.getGpa());
        System.out.println("Report generated successfully!");
    }
}
