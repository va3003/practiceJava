package com.Learning.practiceJava;

import java.util.HashMap;
import java.util.Map;

public class TestC {
    
    public static void main(String args[]){
        int[] num = {1,2,1,3,4,3,5,6,7,9,9,9};
        Map<Integer,Integer> countOfNums = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
            if(countOfNums.containsKey(num[i])){
                countOfNums.put(num[i], countOfNums.get(num[i]) + 1);
            }else{
                countOfNums.put(num[i], 1);
            }
        }
        System.out.println(countOfNums);


        String str = "ajayautomation";
        char[] charr = str.toCharArray();
        int i;
        int j;
        System.out.println(charr);
        for(i=0,j=charr.length-1;i<charr.length/2;i++,j--){
            char tempch = charr[i];
            charr[i]=charr[j];
            charr[j]=tempch;
        }
        System.out.println(charr);
    }
}
