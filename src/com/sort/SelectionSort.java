package com.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5, 4, 2, 1, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{5, 4, 3,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{};selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{1};selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minId=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minId]>arr[j]){
                    minId=j;
//                    swap(arr,i,j);
                }
            }
            if(i!=minId)
                swap(arr,i,minId);

        }

    }

    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
