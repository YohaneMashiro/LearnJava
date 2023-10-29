package com.ithema.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //目标：理解自动类型转换机制
        byte a = 12;
        int b = a;//byte-->int
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c;//int-->double
        System.out.println(d);

        char ch = 'a';//00000000 00000000
        int i = ch;//00000000 00000000 00000000 00000000
        System.out.println(i);
    }
}
