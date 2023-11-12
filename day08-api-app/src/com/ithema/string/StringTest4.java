package com.ithema.string;

import java.util.Scanner;

//目标：完成用户登录案例
public class StringTest4 {
    public static void main(String[] args) {
        //1.开发一个登录界面
        for (int i=1;i<=3;++i) {
            Scanner sc=new Scanner(System.in);
            System.out.println("name:");
            String loginName=sc.next();
            System.out.println("password:");
            String passWord=sc.next();
            //5.调用，判断登录
            boolean rs=login(loginName,passWord);
            if(rs){
                System.out.println("welcome!");
                break;
            }
            else{
                System.out.println("wrong");
            }
        }
    }

    //2.设计一个登录方法，接收用户的登录名和密码，返回认证结果
    public static boolean login(String loginName,String passWord){
        //3.准备一个系统正确的登录名和密码
        String okLoginName="hema";
        String okPassWord="123";
        //4.开始判断
        if(loginName.equals(okLoginName)&&passWord.equals(okPassWord)){
            return true;
        }
        else{
            return false;
        }
    }
}
