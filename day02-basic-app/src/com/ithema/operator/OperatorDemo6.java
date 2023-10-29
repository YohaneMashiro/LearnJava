package com.ithema.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //目标：掌握三元运算符的基本使用
        double score=58.5;
        String rs=score>=60?"yes":"no";
        System.out.println(rs);

        //需求2：2数求最大值
        int a=99;
        int b=69;
        int max=a>b?a:b;
        System.out.println(max);

        //需求3：3数求最大值
        int i=10;
        int j=45;
        int k=34;

        int tmp=i>j?i:j;
        int max2=tmp>k?tmp:k;
        System.out.println(max2);

        // ||优先于&&
        System.out.println(10>3||10>3&&10<3);
        System.out.println((10>3||10>3)&&10<3);
    }
}
