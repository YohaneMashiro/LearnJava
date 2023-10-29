package com.ithema.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：掌握自增自减
        int a=10;
        ++a;//a=a+1
        System.out.println(a);

        --a;//a=a-1
        System.out.println(a);
//        System.out.println(2++);//不能用于操作字面量
        System.out.println("------------------------");

        int i=10;
        int rs=++i;
        System.out.println(rs);
        System.out.println(i);

        int j=10;
        int rs2=j++;
        System.out.println(rs2);
        System.out.println(j);

        //逆天运算
        int m=5;
        int n=3;
        int ans=++m- --m+m-- -++n+n--+3;//模拟
        System.out.println(ans);
        System.out.println(m);
        System.out.println(n);
    }
}
