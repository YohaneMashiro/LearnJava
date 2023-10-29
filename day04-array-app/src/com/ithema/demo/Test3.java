package com.ithema.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] codes=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<codes.length;++i){
            System.out.println("the no." + (i + 1) + " person's code");
            codes[i]=sc.nextInt();
        }

        Random r=new Random();
        for(int i=0;i<codes.length;++i){
            int index=r.nextInt(codes.length);
            int tmp=codes[index];
            codes[index]=codes[i];
            codes[i]=tmp;
        }

        for(int i=0;i<codes.length;++i){
            System.out.print(codes[i]+" ");
        }
    }
}
