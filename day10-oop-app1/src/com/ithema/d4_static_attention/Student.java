package com.ithema.d4_static_attention;

public class Student {
    static String schoolName;//类变量
    double score;//实例变量

    //1.类方法中可以直接访问类的成员，不可以直接访问实例成员和实例方法
    public static void print(){
        //注意：同一个类中，访问类成员时类名可以不写
        schoolName="a";//Student.schoolName="a";
//        System.out.println(score);//不能访问实例变量
//        printpass();//不能访问实例方法
//        this.score//不能使用this
    }
    //类方法
    public static void print2(){}

    //2.实例方法中可以直接访问类成员，也可以直接访问实例成员
    public void printPass(){
        schoolName="b";
        print2();
        System.out.println(score);
        printPass2();
    }
    //实例方法
    public void printPass2(){}
}
