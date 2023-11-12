package com.ithema.pkg;

import com.ithema.pkg.itcast.Demo1;
import com.ithema.pkg.itcast.Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：掌握如何在自己的程序中调用其他程序，注意事项
        //1.同一个包下
        Demo d=new Demo();
        d.print();
        //2.其他包下
        Demo1 d1=new Demo1();
        d1.print();
        //3.调用java提供的程序,lang除外
        Scanner sc=new Scanner(System.in);
        String s=new String();
        //4.访问不同包下的同名程序
        Demo2 d2=new Demo2();
        com.ithema.pkg.ithema.Demo2 d22=new com.ithema.pkg.ithema.Demo2();
    }
}
