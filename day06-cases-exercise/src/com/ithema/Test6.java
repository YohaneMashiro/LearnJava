package com.ithema;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        //抢红包
        int[] moneys={9,666,188,520,9999};
        start(moneys);
    }
    public static void start(int[] moneys){
        Random r=new Random();
        for(int i=0;i<moneys.length;++i){
            int index=r.nextInt(0,moneys.length);
            int tmp=moneys[index];
            moneys[index]=moneys[i];
            moneys[i]=tmp;
        }
        for(int i=0;i<moneys.length;++i){
            System.out.println("the no."+(i+1)+"'s money is: "+moneys[i]);
        }
    }
}
