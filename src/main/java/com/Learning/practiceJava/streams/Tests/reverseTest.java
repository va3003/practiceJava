package com.Learning.practiceJava.streams.Tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseTest {
    public static void main(String[] args) {
        String str = "bacda";
        int maxcharstoreverse = 4;

        for (int i = 1, j = str.length() - 1; i <= 4; i++, j--) {
            String st = str.substring(0, i);
            char[] ch = st.toCharArray();
            String fullRev = new String(reverse(ch)) + str.substring(i, str.length());
            System.out.println("rev list : " + fullRev);

            String ost = str.substring(j, str.length());
            char[] chrev = ost.toCharArray();
            String ofullRev = str.substring(0, j) + new String(chrev);
            System.out.println("orev list : " + ofullRev);
        }
    }

    private static char[] reverse(char[] val){
        if(val.length>1){
            // System.out.println("Inside reverse if lenght : " + val.length);
            for(int i=0;i<val.length/2;i++){
                char temp = val[i];
                // System.out.println("temp : "+ temp);
                val[i]=val[val.length-i-1];
                // System.out.println("val[i] : "+ val[i]);
                val[val.length-i-1] = temp;
            }
        }
        return val;
    }
}