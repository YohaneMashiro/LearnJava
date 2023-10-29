package com.ithema.demo;

public class Test1 {
    public static void main(String[] args) {
        int[] scores={1,2,3,4,5,6};
        int maxscore=-1;
        for(int i=0;i<scores.length;++i){
            maxscore=max(maxscore,scores[i]);
        }
        System.out.println(maxscore);
    }
    static int max(int a,int b){
        return a>b?a:b;
    }
}
