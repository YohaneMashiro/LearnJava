package com.ithema;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //打分
        System.out.println("final score is "+getAverageScore(6));
    }
    public static double getAverageScore(int number){
        int[] scores=new int[number];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<number;++i){
            System.out.println("the no." + (i + 1) + "'s score:");
            scores[i]=sc.nextInt();
        }

        int sum=scores[0],maxScore=scores[0],minScore=scores[0];
        for(int i=1;i<number;++i){
            sum+=scores[i];
            maxScore=maxScore>=scores[i]?maxScore:scores[i];
            minScore=minScore<=scores[i]?minScore:scores[i];
        }
        return (sum-maxScore-minScore)/(number-2.0);
    }
}
