package com.ithema.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int a=10;
        double b=0.1;
        double b2=0.2;
        double c=b+b2;
        System.out.println(c);
        switch(a){

        }

        int i=20;
        int d=20;
        switch (i){
            case 10:
                break;
            case 20:
                break;
            default:
                break;
        }

        String week="周三";
        switch (week){
            case "周一":
                System.out.println("week1");
                break;
            case "周二":
                System.out.println("week2");
                break;
            case "周三":
                System.out.println("week3");
//                break;//穿透现象
            case "周四":
                System.out.println("week4");
//                break;
            case "周五":
                System.out.println("week5");
                break;
            case "周六":
                System.out.println("week6");
                break;
            case "周日":
                System.out.println("week7");
                break;
            default:
                System.out.println("wrong week");
        }
    }
}
