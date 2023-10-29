package com.ithema.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r=new Random();
        int LuckNumber=r.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("plz guess:");
            int GuessNumber=sc.nextInt();
            if(GuessNumber>LuckNumber)
                System.out.println("too big");
            else if(GuessNumber<LuckNumber)
                System.out.println("too small");
            else{
                System.out.println("right");
                break;
            }
        }
    }
}
