package com.ithema.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：掌握关系运算符
        int a=10;
        int b=5;
        boolean rs=a>b;
        System.out.println(rs);

        System.out.println(a>=b);
        System.out.println(2>=2);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(2<=2);
        System.out.println(a==b);
        System.out.println(5==5);//=是赋值，==才是关系
        System.out.println(a!=b);
        System.out.println(10!=10);
    }
}
