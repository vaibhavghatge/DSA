package com.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,17,18,35};
        System.out.println(binarySearch(arr,0,arr.length,17));

        System.out.println(binarySearch(arr,0,arr.length,-12));

        System.out.println(binarySearch(arr,0,arr.length,1));

        System.out.println(binarySearch(arr,0,arr.length,56));
    }

    public static int binarySearch(int arr[],int start,int end,int target){
        System.out.println(Arrays.toString(arr) + "-" +start+ "-"+end+ ""+ target);
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
