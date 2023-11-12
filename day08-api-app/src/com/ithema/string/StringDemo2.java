package com.ithema.string;

public class StringDemo2 {
    public static void main(String[] args) {
        //目标：快速熟悉String提供的常用方法
        String s="abc";
        //1.获取字符串长度
        System.out.println(s.length());
        System.out.println("-------------------");
        //2.提取字符串某个索引的字符
        char c=s.charAt(1);
        System.out.println(c);
        System.out.println("-------------------");
        //3.字符串遍历
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.println(ch);
        }
        System.out.println("-------------------");

        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("-------------------");
        //4.判断字符内容，内容一样返回true
        String s1="hema";
        String s2="hema";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("-------------------");
        //5.大小写不敏感
        String c1="Abc";
        String c2="aBC";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));
        System.out.println("-------------------");
        //6.截取字符串
        String s3="12345678";
        String r3=s3.substring(1,1);
        System.out.println(r3);
        System.out.println("-------------------");
        //7.从当前索引位置一直截取到字符串末尾
        String rs2=s3.substring(3);
        System.out.println(rs2);
        System.out.println("-------------------");
        //8.把字符串某个内容替换成新内容，返回新的字符串
        String info="123451116789";
        String rs3=info.replace("1","*");
        System.out.println(rs3);
        System.out.println("-------------------");
        //9.判断字符串是否包含某个关键字
        String info2="java123456,java789234";
        System.out.println(info2.contains("Java"));
        System.out.println(info2.contains("java"));
        System.out.println("-------------------");
        //10.判断字符串是否以某个字符串开头
        String rs4="abc";
        System.out.println(rs4.startsWith("a"));
        System.out.println(rs4.startsWith("b"));
        System.out.println(rs4.startsWith("ab"));
        System.out.println("-------------------");
        //11.把字符串按照某个指定内容分割，放到一个字符数组中返回
        String rs5="a,b,c,d";
        String[] names=rs5.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
