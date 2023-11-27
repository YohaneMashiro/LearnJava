package com.ithema.d3_util;


/**
*   登录界面
* */
public class LoginDemo {
    public static void main(String[] args) {
        //1.生成验证码
        String code=MyUtil.newCode(4);
        System.out.println(code);
    }
}
