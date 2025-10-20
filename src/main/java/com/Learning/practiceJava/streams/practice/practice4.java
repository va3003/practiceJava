package com.Learning.practiceJava.streams.practice;

public class practice4 {
    public static void main(String[] args) {
        String str = "first String";
        String strObject = new String(str);
        StringBuffer strBufferObj = new StringBuffer(str);
        StringBuilder strBuilderObj = new StringBuilder(str);

        System.out.println("str : " + str);
        System.out.println("strObject : " + strObject);
        System.out.println("strBufferObj : " + strBufferObj);
        System.out.println("strBuilderObj : " + strBuilderObj);

        //== check -- returns incompatible types
        //equals used for verifying strings
        System.out.println("is str == strObject: " + (str.equals(strObject)));
        System.out.println("is str == strObject: " + (strBuilderObj.equals(strBufferObj)));

        
        
    }
}
