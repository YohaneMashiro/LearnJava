package com.ithema.sacnner;

import java.awt.*;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.导包
        //2.抄写代码
        Scanner sc=new Scanner(System.in);

        //3.开始使用sc的功能
        System.out.println("请输入你的年龄：");
        int age=sc.nextInt();
        System.out.println("您的年龄是："+age);

        System.out.println("请输入您的姓名：");
        String name=sc.next();
        System.out.println(name + ",欢迎您进入系统");
    }
}
