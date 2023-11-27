package com.ithema.d2_static_method;

public class Test {
    public static void main(String[] args) {
        //目标掌握有无static修饰方法的用法
        //1.类方法
        Student.printHello();//推荐

        Student s=new Student();
        s.printHello();//不推荐

        //2.实例方法
        s.setScore(60);
        s.printPass(50);

//        Student.printPass(50)//不能通过类调用实例方法
    }
}
