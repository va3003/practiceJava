package com.Learning.practiceJava.streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class practice3 {

    public static void main(String[] args) {
        // int[][] arr = {{1,2},{2,3},{4,5}};
        // int[][] arr = {{1,9},{2,7},{4,15}};
        int[][] arr = {{3,4},{1,5},{4,9}};

        // Arrays.stream(arr).forEach(x->System.out.println(x[0]));   
        List<Integer> sol = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i][0] == 1 && sol.isEmpty()){
                sol.add(arr[i][1]);
            }else if(!sol.isEmpty()){
                if(!isHigherElementPresent(sol,arr[i][1])){
                    sol.add(arr[i][1]);
                }
            }
        }
        System.out.println("sol : " + sol);
    }

    public static boolean isHigherElementPresent(List<Integer> sol, int item){
        boolean isPresent = false;
        for (Integer integer : sol) {
            if(integer > item){
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}