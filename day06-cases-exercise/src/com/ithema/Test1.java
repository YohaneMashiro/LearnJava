package com.ithema;

public class Test1 {
    public static void main(String[] args) {
        //飞机票
        double price=calc(1000,8,"经济舱");
        System.out.println("优惠价是" + price);
    }
    public static double calc(double price,int month,String type){
        if(month>=5&&month<=10){
            //hot
            switch(type){
                case "头等舱":
                    price*=0.9;
                    break;
                case "经济舱":
                    price*=0.85;
                    break;
                default :
                    System.out.println("wrong type");
            }
        }else{
            //cold
            switch(type){
                case "头等舱":
                    price*=0.7;
                    break;
                case "经济舱":
                    price*=0.65;
                    break;
                default :
                    System.out.println("wrong type");
            }
        }
        return price;
    }
}
