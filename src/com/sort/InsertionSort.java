package com.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5, 4, 2, 1, 3};insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{5, 4, 3,1,2};insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{};insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{1};insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1, j);
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
