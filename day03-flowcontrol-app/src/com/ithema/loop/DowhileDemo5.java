package com.ithema.loop;

public class DowhileDemo5 {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println("hello world");
            ++i;
        }while(i<3);

        do{
            System.out.println("Hello World");
        }while(false);
        System.out.println("-------------------------------------");

        for(i=0;i<3;++i){
            System.out.println("hello World");
        }
        int j=0;
        while(j<3){
            System.out.println("hello World");
            ++j;
        }
        System.out.println(j);
    }
}
