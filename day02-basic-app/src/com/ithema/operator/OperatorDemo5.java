package com.ithema.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        double size=6.8;
        int storage=16;

        boolean rs=size>=6.95&&storage>=8;
        System.out.println(rs);

        boolean rs2=size>=6.95|storage>=8;
        System.out.println(rs2);

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2>1));

        int i=10;
        int j=20;
        System.out.println(i>100&++j>99);
        System.out.println(j);

        int m=10;
        int n=30;
        System.out.println(m>3|++n>40);
        System.out.println(n);
    }
}
