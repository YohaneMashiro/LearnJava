package com.ithema.object;

public class Student {
    //成员变量
    String name;
    double cn;
    double math;
    public void printTotalScore(){
        System.out.println(name + "'s total score is: " + (cn + math));
    }
    public void printAverageScore(){
        System.out.println(name + "'s average score is: " + (cn + math)/2.0);
    }
}
