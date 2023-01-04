package com.leetcode.string;

class DeleteColumnsToMakeSorted944 {
    public static void main(String[] args) {
        String [] strs=new String[]{"abc", "bce", "cae"};
        System.out.println(minDeletionSize(strs));
        System.out.println(minDeletionSize(new String[]{ "cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[]{ "a","b"}));
        System.out.println(minDeletionSize(new String[]{ "zyx","wvu","tsr"}));
        System.out.println(minDeletionSize(new String[]{ "rrjk","furt","guzm"}));



    }
    public static int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
//                System.out.print(j+","+i+"="+strs[j].charAt(i)+"\t");
                 if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                     count++;break;
                 }
            }
//            System.out.println();

        }
        return count;
    }
}