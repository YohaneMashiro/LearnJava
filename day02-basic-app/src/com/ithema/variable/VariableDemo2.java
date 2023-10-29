package com.ithema.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：掌握基本数据类型的使用
        //1.byte short int long
        byte a = 127;
//        byte a = 128; //越界
        short s = 12344;
//        short s = 93244;
        int i = 422424;//默认int
        long lg = 2345678900L;
        //2.
        float f = 3.14F;
        double d =  56.45;//默认double
        //3.
        char ch = 'a';
        char ch2 = '中';
        //4.
        boolean fg = true;
        boolean fg2 = false;
        //string
        String name = "张三";
        System.out.println(name);
    }
}
