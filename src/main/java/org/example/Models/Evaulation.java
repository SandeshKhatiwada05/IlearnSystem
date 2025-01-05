package org.example.Models;

public class Evaulation {
    private long evalutationId;
    private float grade;

    public long getEvalutationId() {
        return evalutationId;
    }

    public void setEvalutationId(long evalutationId) {
        this.evalutationId = evalutationId;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void evaulate(){
        System.out.println("Grade Calulated successfully");
    }
}
