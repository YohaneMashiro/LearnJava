package com.ithema;

public class Test7 {
    public static void main(String[] args) {
        //找素数
        for(int i=101;i<=200;++i)
            if(check(i))
                System.out.println(i + " is a prime");
    }

    public static boolean check(int x){
        for(int i=2;i<x;++i){
            if(x%i==0) return false;
        }
        return true;
    }
}
