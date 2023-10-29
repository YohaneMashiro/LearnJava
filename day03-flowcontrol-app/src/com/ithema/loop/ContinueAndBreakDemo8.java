package com.ithema.loop;

public class ContinueAndBreakDemo8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;++i){
            System.out.println("i love u:day"+i);
            if(i==3) break;
        }

        for(int i=1;i<=5;++i){
            if(i==3) continue;
            System.out.println("wash:day" + i);
        }

//        if(3<9){
//            break;
//            contine;
//        }
    }
}
