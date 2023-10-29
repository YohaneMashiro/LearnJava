package com.ithema.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：掌握基本算数运算符
        int a=10;
        int b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(5/2);
        System.out.println(5.0/2);
        int i=5;
        int j=2;
        System.out.println(1.0*i/j);

        System.out.println(a%b);
        System.out.println(3%2);
        System.out.println("--------------------------");

        //目标：掌握+用法
        int a2 = 5;
        System.out.println("abc"+a2);
        System.out.println(a2+5);
        System.out.println("ithema"+a2+'a');
        System.out.println(a2+'a'+"ithema");
    }
}
