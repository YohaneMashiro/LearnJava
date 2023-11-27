package com.ithema.d6_singleInstance;

/**
*   单例设计模式--饿汉式单例
* */

public class A {
    //2.定义一个类变量记住类的一个对象
    private static A a=new A();

    //1.私有构造器
    private A(){}

    //3.定义一个类方法返回类对象
    public static A getObject(){
        return a;
    }
}
