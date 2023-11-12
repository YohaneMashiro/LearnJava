package com.ithema.encapsulation;

public class Student {
    private double score;
    public void setScore(double score){
        if(score>=0&&score<=100){
            this.score=score;
        }
        else{
            System.out.println("invailed");
        }
    }
    public double getScore(){
        return score;
    }
    public void printPass(){
        if(score>=60){
            System.out.println("pass");
        }
        else{
            System.out.println("failed");
        }
    }
}
