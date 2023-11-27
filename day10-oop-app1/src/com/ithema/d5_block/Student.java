package com.ithema.d5_block;

public class Student {
    static int number=80;
    static String schoolName="a";
    //静态代码块,仅类被第一次使用时运行
    static{
        System.out.println("static run once");
    }
    int age;
    //实例代码块，每一个实例运行一次;可以降低代码重复率
    {
        System.out.println("instance run once");
    }

    public Student(){
        System.out.println("without args");
    }
    public Student(String name){
        System.out.println("with args");
    }
}
