package com.Learning.practiceJava.streams.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    //uses declarative and functional programming.
    //source -> intermediate operation and then terminal operation.
    //convert source to stream(sequence of elements)

    public static void main(String[] args) {
     
        List<Integer> list = Arrays.asList(12,2,4,5,6,7,8,10,11);
        Long countOfEven = list.stream().filter(x -> x%2==0).count();
        System.out.println("countOfEven : "+countOfEven);
    
        String[] arr = {"abcd","efg"};
        Stream<String> strStream = Arrays.stream(arr);
        System.out.println(strStream.count());

        System.out.println(Stream.generate(()-> 1).limit(10));
        Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
    }
}
