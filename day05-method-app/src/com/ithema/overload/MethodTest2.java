package com.ithema.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        fire();
        fire("YYY");
        fire("ZZZ",888);
    }
    public static void fire(){
        fire("XXX");
    }
    public static void fire(String country){
        fire(country,999);
    }
    public static void fire(String country,int x){
        System.out.println(country + " " + x);
    }
}
