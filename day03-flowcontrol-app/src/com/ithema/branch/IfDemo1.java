package com.ithema.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        double t=36.9;
        if(t>37){
            System.out.println("高温");
        }

        double money=19;
        if(money>=90){
            System.out.println("成功");
        }
        else{
            System.out.println("余额不足");
        }

        int score=100;
        if(score>=0&&score<60){
            System.out.println("您的绩效是：D");
        }
        else if(score>=60&&score<80){
            System.out.println("您的绩效是：C");
        }
        else if(score>=80&&score<90){
            System.out.println("您的绩效是：B");
        }
        else if(score>=90&&score<=100){
            System.out.println("您的绩效是：A");
        }
        else{
            System.out.println("输入有问题~~");
        }
    }
}
