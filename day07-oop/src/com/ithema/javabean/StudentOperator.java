package com.ithema.javabean;

public class StudentOperator {
    private Student s;
    public StudentOperator(Student s) {
        this.s = s;
    }
    public void printPass(){
        System.out.println(s.getScore() >= 60 ? "pass" : "failed");
    }
}
