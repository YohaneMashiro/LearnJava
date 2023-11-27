package com.ithema.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        //目标：掌握有无static修饰成员变量的用法和特点
        //1.类变量的用法
        Student.name="a";//推荐

        Student s1=new Student();
        s1.name="b";//不推荐

        //2.实例变量的用法
        s1.age=23;

//        System.out.println(Student.age);//不能通过类找实例变量
    }
}
