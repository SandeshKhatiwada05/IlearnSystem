package org.example.Models;

public class Student extends UserEntity {
    private Long symbolNo;
    private float gpa;

    public Long getSymbolNo() {
        return symbolNo;
    }

    public void setSymbolNo(Long symbolNo) {
        this.symbolNo = symbolNo;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void trackReport() {
        System.out.println("Tracking report for Student ID: " + symbolNo);
        System.out.println("GPA: " + gpa);
    }
}
