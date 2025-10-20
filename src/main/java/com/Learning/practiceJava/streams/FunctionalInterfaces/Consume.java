package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consume {
    
    //Consumer - consumes the parameter and does not return anything.

    public static void main(String[] args) {
     
        Consumer<Integer> consPrint = x -> System.out.println(x);
        consPrint.accept(10);

        List<Integer> listInt = Arrays.asList(3,5,6);
        Consumer<List<Integer>> listPrint = x -> {
            for(int i:x){
                System.out.println(i);
            }
        };
        listPrint.accept(listInt);
    }
}
