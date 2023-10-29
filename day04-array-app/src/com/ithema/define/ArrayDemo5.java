package com.ithema.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] ages=new int [3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0]=1;
        ages[1]=2;
        ages[2]=3;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println("------------------------------");

        char[] chars=new char[3];
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println("------------------------------");

        double[] scores=new double[3];
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("------------------------------");

        boolean[] flag=new boolean[3];
        System.out.println(flag[0]);
        System.out.println(flag[1]);
        System.out.println(flag[2]);
        System.out.println("------------------------------");

        String[] names=new String[3];
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
