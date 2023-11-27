package com.ithema.d2_static_method;

public class Student {
    double score;

    //类方法
    public static void printHello(){
        System.out.println("Hello");
    }

    //实例方法
    public void printPass(double level){
        System.out.println(score >= level ? "pass" : "fail");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
