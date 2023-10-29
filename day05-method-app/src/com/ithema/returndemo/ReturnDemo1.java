package com.ithema.returndemo;

import java.util.Scanner;

public class ReturnDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===start===");
        int a=sc.nextInt(),b=sc.nextInt();
        div(a,b);
        System.out.println("===end===");
    }
    public static void div(int a,int b){
        if(b==0){
            System.out.println("RE");
            return ;
        }
        System.out.println("the division is "+a/b);
    }
}
