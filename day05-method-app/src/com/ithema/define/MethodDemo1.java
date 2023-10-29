package com.ithema.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        {
            int rs=sum(10,20);
            System.out.println("the sum is" + rs);
        }
        {
            int rs=sum(30,20);
            System.out.println("the sum is" + rs);
        }
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
