package org.example.Models;

public class Progress {

    private Long progressId;
    private String status;

    public void trackStudentProgress() {
        Student student = new Student(); // Create a new Student object
        student.setSymbolNo(12345L); // Example of setting a SymbolNo
        System.out.println("Student Symbol Number: " + student.getSymbolNo());
        student.trackReport(); // Call the trackReport method
    }


}
