package com.ithema;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //加密
        Scanner sc=new Scanner(System.in);
        System.out.println("the number you are expected to be encrypted is");
        int number=sc.nextInt();
        System.out.println("the number after encrypting is " + encrypt(number));
    }
    public static String encrypt(int number){
        int[] numbers=split(number);
        for(int i=0;i<numbers.length;++i){
            numbers[i]=(numbers[i]+5)%10;
        }
        reverse(numbers);
        String data="";
        for(int i=0;i<numbers.length;++i){
            data+=numbers[i];
        }
        return data;
    }
    public static int[] split(int number){
        int[] numbers=new int[4];
        numbers[0]=number/1000;
        numbers[1]=(number/100)%10;
        numbers[2]=(number/10)%10;
        numbers[3]=number%10;
        return numbers;
    }
    public static void reverse(int[] numbers){
        for(int i=0,j=numbers.length-1;i<j;++i,--j){
            int tmp=numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=tmp;
        }
    }
}
