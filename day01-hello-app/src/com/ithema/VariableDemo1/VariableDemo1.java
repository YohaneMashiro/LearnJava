package com.ithema.VariableDemo1;

public class VariableDemo1 {
    public static void main(String[] args) {
        //目标：认识变量
        //1。定义一个整型变量
        int age = 23;
        System.out.println(age);

        //2.记住一个人的成绩
        double score = 99.5;
        System.out.println(score);
        System.out.println("---------------------");

        //3.使用变量的好处，便于扩展和维护
        int num = 888;
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);

        System.out.println("------------------------");
        //4.变量的特点，里面装的数据可以被替换
        int age2 = 18;
        System.out.println(age2);

        age2=19;
        System.out.println(age2);
        System.out.println("--------------------------");
        //5.需求：钱包有9.5元，收到了10元，发出去5元
        double money = 9.5;
        System.out.println(money);
        //收到红包10元
        money+=10;
        System.out.println(money);
        //发出去5元
        money-=5;
        System.out.println(money);
    }
}
