package com.ithema.javabean;

public class Student {
    //1.必须有成员变量，为每一个成员提供get/set
    private String name;
    private double score;

    //2.必须为类提供一个公开的无参构造器
    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
