package com.ithema.object;

public class Test2 {
    public static void main(String[] args) {
        //目标：掌握类与对象的一些注意事项
        //1.类名建议使用英文单词，驼峰模式
        //2.类中定义的变量也叫成员变量，类中定义的方法也叫成员方法
        //3.成员变量存在默认值，定义时一般不赋初值
        {
            Student s=new Student();
            System.out.println(s.name);
            System.out.println(s.cn);
            System.out.println(s.math);
        }
        //4.一个代码文件中可以有多个class，但是只能有一个public修饰并和文件名一致
        //5.对象间的数据不会相互影响，但多个变量指向同一个对象时会影响
        //6.某个对象没有变量引用，叫做垃圾对象
        {
            Student s = new Student();
            s.name = "Tom";
            Student ss = s;//此时是将s的地址给了ss
            ss.name = "tom";
            System.out.println(s.name);

            s=null;
            ss=null;//至此成为垃圾，会被自动回收
            System.out.println(s.name);
        }
    }
}
