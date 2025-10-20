package com.Learning.practiceJava.streams.streaming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {

    private static Integer factorial(Integer num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));

        List<Integer> st = Stream.iterate(1, x -> x + 1).limit(10).collect(Collectors.toList());
        System.out.println("st : " + st);

        Optional<Integer> factorialOf4 = Stream.iterate(1, x -> x + 1).limit(4).reduce((x, y) -> x * y);
        System.out.println("factorialOf4 : " + factorialOf4.get());

        Optional<Integer> factorial = Stream.iterate(1, x -> x + 1).limit(4).parallel().reduce((x, y) -> x * y);
        System.out.println("factorial : " + factorial.get());

        System.out.println("factorial of all : ");
        List<Integer> factorial2 = Stream.iterate(1,
        x->x+1).limit(4).map(ParallelStream::factorial).collect(Collectors.toList());
        factorial2.forEach(System.out::println);
    }
}
