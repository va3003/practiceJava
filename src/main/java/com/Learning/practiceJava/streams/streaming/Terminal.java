package com.Learning.practiceJava.streams.streaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal {
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 3, 4, 6, 7, 8,10, 11);
        //collect


        //foreach
        // list.stream().forEach(null);
        //foreach ordered - uses parallelstream data in ordered sequence.

        //reduce : accumulating value into 1.
        //summing values
        Optional<Integer> sum = list.stream().reduce((x,y)->x+y);
        System.out.println("reduce : " + sum.get());

        Optional<Integer> sum2 = list.stream().reduce((x,y)->Integer.sum(x,y));
        System.out.println("reduce : " + sum2.get());

        Optional<Integer> sum3 = list.stream().reduce(Integer::sum);
        System.out.println("reduce : " + sum3.get());

        System.out.println("collector : " + list.stream().collect(Collectors.summingInt(Integer::intValue)));
        //count


        //short circuit methods.

        //allmatch
        System.out.println("any match : " + list.stream().allMatch(x->x>5));

        //anymatch
        System.out.println("any match : " + list.stream().anyMatch(x->x>5));

        //noneMatch
        System.out.println("any match : " + list.stream().noneMatch(x->x>1));

        //findfirst
        System.out.println("findfirst : " + list.stream().findFirst().get());

        //findany
        System.out.println("findfirst : " + list.stream().findAny().get());

        //max

        System.out.println("max natural order : " + list.stream().max(Comparator.naturalOrder()).get());
        System.out.println("max reverse order : " + list.stream().max(Comparator.reverseOrder()).get());
        System.out.println("max : " + list.stream().max((x,y)->y-x).get());

        //exception - Streams cannot be re-used after being closed
        //means if terminal operation is being used on stream, we cannot re-use streams.


    }
}
