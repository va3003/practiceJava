package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    
    public static void main(String[] args) {
        
        List<Integer> arrayInt = Arrays.asList(10,12,13);
        arrayInt.stream().forEach(x -> System.out.println(x));

        System.out.println("now using method reference.");
        arrayInt.stream().forEach(System.out::println);
    }
}
