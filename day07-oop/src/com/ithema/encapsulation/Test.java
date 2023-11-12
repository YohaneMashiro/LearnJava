package com.ithema.encapsulation;

public class Test {
    public static void main(String[] args) {
        //目标：掌握封装设计规范，合理隐藏合理暴露
        Student s1=new Student();
        s1.setScore(100);
        System.out.println(s1.getScore());
        s1.printPass();
    }
}
