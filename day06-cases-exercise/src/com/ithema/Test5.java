package com.ithema;

public class Test5 {
    public static void main(String[] args) {
        //拷贝
        int[] arr={11,22,33};
        int[] arr2=copy(arr);
        printArry(arr2);
    }

    public static void printArry(int[] arr2){
        System.out.print("[");
        for(int i=0;i<arr2.length;++i){
            if(i==arr2.length-1){
                System.out.print(arr2[i] + "]");
            }
            else{
                System.out.print(arr2[i] + ",");
            }
        }
    }

    public static int[] copy(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;++i){
            arr2[i]=arr[i];
        }
        return arr2;
    }
}
