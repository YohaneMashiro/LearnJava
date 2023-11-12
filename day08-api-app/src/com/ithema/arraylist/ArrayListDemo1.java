package com.ithema.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建ArrayList，熟悉常用方法
        //1.创建一个arraylist对象
        ArrayList<String> list=new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //2.往集合中的某个索引位置添加一个元素
        list.add(1,"mysql");
        System.out.println(list);

        //3.根据索引获取集合中某个索引位置的值
        String rs=list.get(1);
        System.out.println(rs);

        //4.获取集合大小
        System.out.println(list.size());

        //5.根据索引删除集合中某个元素值，返回删除元素值
        System.out.println(list.remove(1));
        System.out.println(list);

        //6.直接删除某个元素值，成功true
        list.add("a");
        System.out.println(list.remove("a"));//
        System.out.println(list);

        //7.修改某个索引位置,返回原来的值
        System.out.println(list.set(1, "abv"));
        System.out.println(list);
    }
}
