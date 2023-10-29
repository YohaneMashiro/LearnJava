package com.ithema;

public class Test8 {
    public static void main(String[] args) {
        //打印乘法表
        myout();
    }

    public static void myout(){
        for(int i=1;i<=9;++i){
            for(int j=1;j<=i;++j){
                System.out.print(i + "x" + i + "=" + i * i+" ");
            }
            System.out.println("");
        }
    }
}
