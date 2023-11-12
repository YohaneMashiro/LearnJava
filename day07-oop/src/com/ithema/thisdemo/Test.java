package com.ithema.thisdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识this，掌握this
        {
            Student s=new Student();
            System.out.println(s);
            s.printThis();
            System.out.println("---------------------");
        }
        {
            Student s=new Student();
            System.out.println(s);
            s.printThis();
        }
        {
            Student s=new Student();
            s.score=123;
            s.printPass(150);
        }
    }
}
