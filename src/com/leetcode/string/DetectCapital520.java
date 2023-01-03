package com.leetcode.string;

public class DetectCapital520 {
    //https://leetcode.com/problems/detect-capital/description/

    public boolean detectCapitalUse(String word) {
        int cap=0;
        int low=0;
        int l=word.length();
        for(int i=0;i<l;i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                cap++;
            }
            else if(ch>='a' && ch<='z'){
                low++;
            }
        }
        if(cap==l){
            return true;
        }
        else if(low==l){
            return true;
        }
        char ch= word.charAt(0);
        if(ch>='A' && ch<='Z'
                && cap==1 && (cap+low)==l
        ){
            return true;
        }
        return false;
    }
}
