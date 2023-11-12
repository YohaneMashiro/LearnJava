package com.ithema.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.设计一个电影类
        //2.设计一个电影操作类
        Film[] films=new Film[3];
        Film m1=new Film(1,"a",1,1,"aa","aaa","none");
        Film m2=new Film(2,"b",2,2,"bb","bbb","none");
        Film m3=new Film(3,"c",3,3,"cc","ccc","none");
        films[0]=m1;
        films[1]=m2;
        films[2]=m3;

//        FilmOperator operator=new FilmOperator(films);
//        operator.printMainInfo();
//        operator.searchFilmById(3);

        FilmOperator operator=new FilmOperator(films);
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("====welcome to the system====");
            System.out.println("0.shutdown");
            System.out.println("1:check all main info");
            System.out.println("2:search a film by id");
            System.out.println("plz key 1 or 2...");
            int command=sc.nextInt();
            switch(command){
                case 0:
                    flag=false;
                    System.out.println("nice to meet you");
                    break;
                case 1:
                    operator.printMainInfo();
                    break;
                case 2:
                    System.out.println("plz give a id to search:");
                    int id=sc.nextInt();
                    operator.searchFilmById(id);
                    break;
                default:
                    System.out.println("plz give correct command!!");
            }
        }
    }
}
