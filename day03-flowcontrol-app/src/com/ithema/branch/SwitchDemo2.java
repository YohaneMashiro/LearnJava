package com.ithema.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String week="周三";
        switch(week){//只能是byte short int long float double String
            case "周一":
                System.out.println("week1");
                break;
            case "周二":
                System.out.println("week2");
                break;
            case "周三":
                System.out.println("week3");
                break;
            case "周四":
                System.out.println("week4");
                break;
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
