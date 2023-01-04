package com.sort;

import java.util.Arrays;

//2N-1 swaps
public class CyclicSort {

    public static void main(String[] args) {
        int arr[]={5, 4, 2, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{5, 4, 3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{};sort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{1};sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i,correct);
            }else{
                i++;
            }

        }
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
