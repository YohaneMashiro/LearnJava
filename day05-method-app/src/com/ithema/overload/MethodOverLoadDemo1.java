package com.ithema.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(1);
    }
    public static void test(){
        System.out.println("===test1===");
    }
    public static void test(int a){
        System.out.println("===test2===" + a);
    }
    void test(double a){

    }
    void test(double a,double b){

    }
//    void test(double a,double b){
//
//    }
}
