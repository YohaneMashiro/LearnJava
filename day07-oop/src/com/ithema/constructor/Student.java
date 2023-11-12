package com.ithema.constructor;

public class Student {
    String name;
    double score;
    //无参构造器
    public Student(){
        System.out.println("no");
    }
    //有参构造器
    public Student(String name,int score){
        System.out.println("yes");
        this.name=name;
        this.score=score;
    }
}
