package com.ithema.Random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r=new Random();
        for(int i=1;i<=5;++i){
            int data=r.nextInt(10);
            System.out.println(data);
        }
        System.out.println("------------------");

        for(int i=1;i<=5;++i){
            int data=r.nextInt(10)+1;
            System.out.println(data);
        }
        System.out.println("-----------------------");

        for(int i=1;i<=5;++i){
            int data=r.nextInt(15)+3;
            System.out.println(data);
        }
    }
}
