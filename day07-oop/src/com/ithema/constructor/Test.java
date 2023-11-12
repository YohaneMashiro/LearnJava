package com.ithema.constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识构造器，特点、应用场景、注意事项
        Student s=new Student("a",1);
        Student s1=new Student();
        s1.name="a";
        s1.score=100;

        Student s2=new Student("b",99);
        System.out.println(s2.name);
        System.out.println(s2.score);

        Teacher t=new Teacher();
    }
}
