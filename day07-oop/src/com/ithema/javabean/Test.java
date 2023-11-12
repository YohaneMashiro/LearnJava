package com.ithema.javabean;

public class Test {
    public static void main(String[] args) {
        //目标：掌握实体类的书写要求，特点，应用场景
        Student s1=new Student();
        s1.setName("a");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator s=new StudentOperator(s1);
        s1.setScore(59);
        s.printPass();//failed
    }
}
