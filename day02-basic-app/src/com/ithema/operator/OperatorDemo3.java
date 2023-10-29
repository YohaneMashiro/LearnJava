package com.ithema.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握扩展赋值运算符
        //+=
        //需求：收红包
        double a=9.5;
        double b=520;
        a+=b;
        System.out.println(a);

        double i=600;
        double j=520;
        i-=j;//i=(double)(i-j)
        System.out.println(i);

        int m=10;
        int n=5;
        m%=n;
        /*
        * m*=n,m/=n
        * */
        System.out.println(m);
        System.out.println("------------------------");
        byte x=10;
        byte y=30;
//        x=x+y;错误，右值是int
        x+=y;
        System.out.println(x);
    }
}
