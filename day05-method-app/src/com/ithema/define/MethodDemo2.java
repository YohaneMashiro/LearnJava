package com.ithema.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        printHelloWorld(3);
        System.out.println("---------------------");
        printHelloWorld(6);
    }
    public static void printHelloWorld(int n){
        for(int i=1;i<=n;++i)
            System.out.println("Hello World");
    }
}
