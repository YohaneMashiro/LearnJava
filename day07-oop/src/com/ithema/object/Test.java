package com.ithema.object;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Tom";
        s.cn=100;
        s.math=80;
        s.printTotalScore();
        s.printAverageScore();
    }
}
