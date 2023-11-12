package com.ithema.string;

public class StringDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建Sring，封装处理的字符串的方法
        //1.直接双引号得到并封装
        String name="a";
        System.out.println(name);
        //2.new String并调用构造器
        String rs1=new String();
        System.out.println(rs1);

        String rs2=new String("a");
        System.out.println(rs2);

        char[] chars={'a','b','c'};
        String rs3=new String(chars);
        System.out.println(rs3);

        byte[] bytes={97,98,99};
        String rs4=new String(bytes);
        System.out.println(rs4);
    }
}
