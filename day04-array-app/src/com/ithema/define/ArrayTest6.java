package com.ithema.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        double[] scores=new double[6];
        double sum=0;
        double maxnumber=-1;
        double minnumber=114514;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<scores.length;++i){
            System.out.println("the score of the "+(i+1)+" person'score");
            scores[i]=sc.nextDouble();
            sum+=scores[i];
            maxnumber=max(maxnumber,scores[i]);
            minnumber=min(minnumber,scores[i]);
        }
        System.out.println("the final score is "+(sum - maxnumber - minnumber) / 4.0);
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    static double min(double a,double b){
        return a<b?a:b;
    }
}
