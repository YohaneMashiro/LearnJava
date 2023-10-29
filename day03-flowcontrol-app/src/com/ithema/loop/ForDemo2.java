package com.ithema.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        for(int i=1;i<=100;++i){
            System.out.println(i);
        }
        System.out.println("-----------------------");

        int sum=0;
        for(int i=1;i<=100;++i){
            sum+=i;
        }
        System.out.println("the sum of 1-100 is " + sum);
        System.out.println("-----------------------");

        sum=0;
        for(int i=1;i<=100;i+=2){
            sum+=i;
        }
        System.out.println("the odds of 1-100 is " + sum);
        System.out.println("-------------------");

        sum=0;
        for(int i=1;i<=100;++i){
            if((i&1)==1){
                sum+=i;
            }
        }
        System.out.println("the odds of 1-100 is " + sum);
    }
}
