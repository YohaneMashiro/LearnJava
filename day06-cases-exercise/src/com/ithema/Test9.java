package com.ithema;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //双色球
        int[] userNumbers=getUserNumber();
        int[] ansNumbers=getAnsNumber();
        checkReward(userNumbers,ansNumbers);
    }
    public static int[] getUserNumber(){
        Random r=new Random();
        int[] x=new int[7];
        for(int i=0;i<6;++i){
            x[i]=r.nextInt(1,34);
        }
        x[6]=r.nextInt(1,17);
        return x;
    }
    public static int[] getAnsNumber(){
        Random r=new Random();
        int[] x=new int[7];
        for(int i=0;i<6;++i){
            x[i]=r.nextInt(1,34);
        }
        x[6]=r.nextInt(1,17);
        return x;
    }
    public static void checkReward(int[] x,int[] y){
        int Red=0;
        int Blue=0;
        for(int i=0;i<6;++i){
            Red+=x[i]==y[i]?1:0;
        }
        Blue=x[6]==y[6]?1:0;

        System.out.println("user:");
        for(int i=0;i<5;++i){
            System.out.println("the no." + (i + 1) + " red ball is: " + x[i]);
        }
        System.out.println("the blue ball is: " + x[6]);

        System.out.println("ans:");
        for(int i=0;i<5;++i){
            System.out.println("the no." + (i + 1) + " red ball is: " + x[i]);
        }
        System.out.println("the blue ball is: " + x[6]);

        switch(Blue){
            case 0:
                switch (Red){
                    case 6:
                        System.out.println("500w");
                        break;
                    case 5:
                        System.out.println("200");
                        break;
                    case 4:
                        System.out.println("10");
                        break;
                    default:
                        System.out.println("no reward");
                        break;

                }
                break;
            case 1:
                switch (Red){
                    case 6:
                        System.out.println("1000w");
                        break;
                    case 5:
                        System.out.println("3000");
                        break;
                    case 4:
                        System.out.println("200");
                        break;
                    case 3:
                        System.out.println("10");
                        break;
                    case 2:
                    case 1:
                    default:
                        System.out.println("5");
                        break;
                }
                break;
        }
    }
}
