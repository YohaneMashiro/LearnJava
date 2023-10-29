package com.ithema.VariableDemo1;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：注意事项
        //1.先声明后使用
        int age = 18;
        System.out.println(age);
        //2.变量和数据类型一致
        //age = 9.8;
        //3.变量从定义开始的{}内生效，不可重名
        {
            int a = 19;
//            int a = 20;
            System.out.println(a);
        }
//        System.out.println(a);
        //4.使用前变量要初始化
        int num;
        num=100;
        System.out.println(num);
    }
}
