package com.ithema.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a=10;
        change(a);
        System.out.println("main:" + a);
    }
    public static void change(int a){
        System.out.println("change1:" + a);
        a+=10;
        System.out.println("change2:" + a);
    }
}
