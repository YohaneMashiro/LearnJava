package com.ithema.define;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        {
            int rs=add(5);
            System.out.println("the sum of 1-5:" + rs);
        }
        {
            int rs=add(100);
            System.out.println("the sum of 1-100:" + rs);
        }
        {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.println(odd(x));
        }
    }
    public static int add(int n){
        int sum=0;
        for(int i=1;i<=n;++i)
            sum+=i;
        return sum;
    }
    public static String odd(int x){
        return (x&1)==1?"奇数":"偶数";
    }
}
