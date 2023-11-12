package com.ithema.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象
        ArrayList<String> list=new ArrayList<>();
        list.add("ac");
        list.add("b");
        list.add("c");
        list.add("ec");
        //2.完成需求，找到c并删除
        //bug:
//        {
//            for (int i = 0; i < list.size(); i++) {
//                String ele=list.get(i);
//                if(ele.contains("c")){
//                    list.remove(ele);
//                }
//            }
//            System.out.println(list);
//        }
        //corrct
//        {
//            for (int i = 0; i < list.size(); i++) {
//                String ele=list.get(i);
//                if(ele.contains("c")){
//                    list.remove(ele);
//                    --i;
//                }
//            }
//            System.out.println(list);
//        }
        //or
        {
            for (int i = list.size()-1; i >=0 ; --i) {
                String ele=list.get(i);
                if(ele.contains("c")){
                    list.remove(i);
                }
            }
            System.out.println(list);
        }
    }
}
