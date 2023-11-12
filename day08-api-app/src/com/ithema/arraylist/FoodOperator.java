package com.ithema.arraylist;

/*
* 菜品操作类
* */

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    //1.定义一个集合，负责储存
    private ArrayList<Food> fs=new ArrayList<>();
    //2.开发功能：上架
    public void addFood(){
        //3.创建一个菜品对象
        Food f=new Food();
        //4.录入菜品信息
        Scanner sc= new Scanner(System.in);
        System.out.println("name:");
        f.setName(sc.next());
        System.out.println("price:");
        f.setPrice(sc.nextDouble());
        System.out.println("desc:");
        f.setDesc(sc.next());
        //5.存入集合
        fs.add(f);
        System.out.println("done!");
    }
    //6.展示菜品
    public void showAllFood(){
        if(fs.size()==0){
            System.out.println("no dish");
            return ;
        }
        for (int i = 0; i < fs.size(); i++) {
            Food f=fs.get(i);
            System.out.println("name: "+f.getName());
            System.out.println("price: "+f.getPrice());
            System.out.println("Desc: "+f.getDesc());
            System.out.println("------------------------");
        }
    }
    //启动操作界面
    public void start(){
        while (true) {
            System.out.println("decide:(1:in/2:out/3:done)");
            Scanner sc=new Scanner(System.in);
            String command=sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFood();
                    break;
                case "3":
                    System.out.println("nice to meet you");
                    return ;
                default:
                    System.out.println("undefined op");
                    break;
            }
        }
    }
}
