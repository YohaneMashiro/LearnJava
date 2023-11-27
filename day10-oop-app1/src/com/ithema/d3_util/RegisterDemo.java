package com.ithema.d3_util;

/**
*   注册界面
* */

public class RegisterDemo {
    public static void main(String[] args) {
        //1.生成验证码
        String code=MyUtil.newCode(8);
        System.out.println(code);
    }
}
