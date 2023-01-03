package com.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={5, 4, 2, 1, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{5, 4, 3,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{};bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{1};bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i< arr.length-1 ;i++){
            boolean sorted=true;
            for(int j=1;j< arr.length-i;j++){
                    if(arr[j-1]>arr[j]){
                        swap(arr, j, j-1);
                        sorted=false;
                    }
            }
            if(sorted){System.out.println("Sorted at i th:"+i);break;}
        }
    }

    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
