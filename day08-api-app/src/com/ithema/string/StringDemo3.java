package com.ithema.string;

public class StringDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚String使用时的几个注意事项
        //1.String的对象是不可变的
        String name="a";
        name+="b";
        name+="c";
        System.out.println(name);//每次都产生了一个新的字符串常量

        String name1="abc";
        String name2="abc";
        System.out.println(name1 == name2);//比较地址

        char[] chars={'a','b','c'};
        String s1=new String(chars);
        String s2=new String(chars);
        System.out.println(s1 == s2);

        String a1="xyz";
        String a2="x"+"y"+"z";
        System.out.println(a1 == a2);
    }
}
