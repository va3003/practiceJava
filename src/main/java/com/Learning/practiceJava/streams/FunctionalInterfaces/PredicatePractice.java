package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String args[]){
        //1. Predicate - one line method use to check conditions = returns true and false.
        //takes one argument only
        //uses test(a), and and or to use two more predicates together.
        //you can use it to check condition only.

        Predicate<Integer> pred = x -> x == 3;
        
        int a = 3;
        int b = 6;
        int c = 4;

        System.out.println("matches 3 : " + pred.test(a));

        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println("isEven : " + isEven.test(a));

        
        Predicate<String> matches = x -> x.compareTo("ccd")==0;
        String abcd = "abcd";
        System.out.println("matches : " + matches.test(abcd));
        String abcd2 = "ccd";
        System.out.println("matches : " + matches.test(abcd2));


        //joining 2 predicates
        Predicate<String> startsWith = x -> x.startsWith("a");
        Predicate<String> endsWith = x -> x.endsWith("d");

        Predicate<String> checkFirstAndLast = startsWith.and(endsWith);

        System.out.println("checkFirstAndLast : " + checkFirstAndLast.test(abcd));
        System.out.println("checkFirstAndLast : " + checkFirstAndLast.test(abcd2));


        //BiPredicate = takes two arguments

        BiPredicate<Integer,Integer> compareBi = (x,y) -> x == y;
        System.out.println("bi predicate : " + compareBi.test(3,5));
        System.out.println("bi predicate : " + compareBi.test(3,3));

    }
    
}
