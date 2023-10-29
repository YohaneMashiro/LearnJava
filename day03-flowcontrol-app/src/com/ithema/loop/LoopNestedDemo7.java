package com.ithema.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        for(int i=1;i<=3;++i){
            for(int j=1;j<=5;++j){
                System.out.println("i love u:day"+j);
            }
            System.out.println("-------------------");
        }

        for(int i=1;i<=4;++i){
            for(int j=1;j<=4;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
