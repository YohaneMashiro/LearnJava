package com.ithema.variable;

public class ASCIIDemo1 {
    public static void main(String[] args) {
        //目标：掌握ASCII编码
        System.out.println('a'+10);//97+10=107
        System.out.println('A'+10);//65+10=75
        System.out.println('0'+10);//48+10=58
        //二进制 八进制 十六进制
        int a1 = 0B01100001;//0b开头是二进制
        System.out.println(a1);
        int a2 = 0141;//0开头是八进制
        System.out.println(a2);
        int a3 = 0xFA;//0x开头是十六进制
        System.out.println(a3);
    }
}
