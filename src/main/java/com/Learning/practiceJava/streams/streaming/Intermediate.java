package com.Learning.practiceJava.streams.streaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Intermediate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 4, 5, 6, 7, 8, 10, 11);

        // filter
        System.out.println("evens in list : " + list.stream().filter(x -> x % 2 == 0).count());

        // map
        List<Integer> squareStream = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("squareStream : " + squareStream);

        // sorted
        System.out.println("sorted stream : " + list.stream().sorted().collect(Collectors.toSet()));

        // sortedwithcomparator
        System.out.println("sorted stream with comparator : "
                + list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet()));

        // distinct
        List<Integer> duplist = Arrays.asList(12, 2, 4, 4, 6, 7, 8, 2, 11);
        System.out.println("distinct set : " + duplist.stream().distinct().collect(Collectors.toSet()));
        
        // limit
        System.out.println("limited list : " + list.stream().limit(3).collect(Collectors.toList()));

        // skip
        System.out.println("skipped list : " + list.stream().skip(2).map(x->x*x).collect(Collectors.toList()));

        //peek
        //performs operation like foreach which is terminal.

        list.stream().skip(2).map(x->x*x).peek(System.out::println).count();

        //flatmap - handles streams where each element in itself is collection for ex. list<list<integer>>
        List<List<String>> fruits = Arrays.asList(Arrays.asList("orange","kiwi"),Arrays.asList("apple","banana"));
        List<String> listfruits = fruits.stream().flatMap(x->x.stream()).map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println("fruit list in uppercase : " + listfruits);

        //sequence - converts parallell stream to sequeune for further sequential operation.
    }

}
