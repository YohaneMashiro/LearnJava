package com.ithema.d3_util;

import java.util.Random;

/**
 *  类方法的应用场景--工具类
 *
 * */
public class MyUtil {
    private MyUtil(){}//工具类不需要实例，将构造器私有

    public static String newCode(int n){
        String code="";
        String data="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLXCVBNM123456789";

        Random r=new Random();
        for(int i=0;i<n;++i){
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }

        return code;
    }
}
