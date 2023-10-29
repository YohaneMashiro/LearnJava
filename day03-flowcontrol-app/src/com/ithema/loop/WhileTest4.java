package com.ithema.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        double PeakHeight=8848860;
        double PaperThickness=0.1;
        int cnt=0;

        while(PaperThickness<PeakHeight){
            ++cnt;
            PaperThickness*=2;
        }

        System.out.println("how many times ? "+cnt);
        System.out.println("how chick the paper? " + PaperThickness);
    }
}
