package com.ithema.demo;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        for(int i=0,j=arr.length-1;i<j;++i,--j){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }
}
