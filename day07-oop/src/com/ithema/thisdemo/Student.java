package com.ithema.thisdemo;

public class Student {
    double score;
    public void printThis(){
        System.out.println(this);
    }
    public void printPass(double score){
        if(this.score>score) System.out.println("pass");
        else System.out.println("fail");
    }
}
