package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Functions {
    
    public static void main(String[] args) {
        
        //functions in functional interface
        //takes arguments and processes them
        //returns value.
        //uses to process elements and return avalue
        //uses apply method.
        
        //Function(T,R) => R apply (T t). T is parameter and R is return value.

        int a = 10;

        Function<Integer,Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(a));


        //check condition with Function.
        Function<Integer,Boolean> isEven = x -> x % 2 == 0;
        Function<Integer,Boolean> isOdd = x -> x % 2 == 1;

        System.out.println(isEven.apply(a));


        Function<Integer,Boolean> nst = isEven.compose(doubleIt);
        System.out.println(nst.apply(a));

        
        Function<Integer,Boolean> nst3 = doubleIt.andThen(isOdd);
        System.out.println(nst3.apply(3));
        Function<Integer,Boolean> nst4 = doubleIt.andThen(isEven);
        System.out.println(nst4.apply(3));

        Function.identity();

        BiFunction<Integer,Integer,Integer> sumBiFunction = (x,y) -> x + y;
        System.out.println("sumBiFunction : " + sumBiFunction.apply(3,5));

        BinaryOperator<Integer> sumBinaryFunction = (x,y) -> x + y;
        System.out.println("sumBinaryFunction : " + sumBinaryFunction.apply(3,5));

    }
}
