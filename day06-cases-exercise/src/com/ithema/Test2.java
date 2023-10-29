package com.ithema;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //验证码
        System.out.println(createCode(10));
    }
    public static String createCode(int n){
        Random r=new Random();
        String code="";
        for(int i=1;i<=n;++i){
            int type=r.nextInt(0,3);
            switch(type){
                case 0:
                    code+=r.nextInt(0,10);
                    break;
                case 1:
                    code+=(char)r.nextInt('a','b'+1);
                    break;
                case 2:
                    code+=(char)r.nextInt('A','b'+1);
                    break;
            }
        }
        return code;
    }
}
