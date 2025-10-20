package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import java.util.function.Function;

public class CollectorsTest {
    // Collectors - utility class
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "how", "are", "you", "in", "this", "world");

        // grouping by length
        Map<Object, List<String>> newlist = list.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(newlist);

        // counting words occurence
        Map<Object, Long> newlist2 = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(newlist2);

        List<Integer> listNum = Arrays.asList(2, 5, 6, 9, 12, 13,6,5,12);

        // partitioning by even and oddd
        Map<Boolean, List<Integer>> partitionedlist = listNum.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        // System.out.println("partitionedlist : ",partitionedlist);
        Collection<List<Integer>> vals = partitionedlist.values();
        System.out.println(vals);

        for (Entry<Boolean, List<Integer>> entry : partitionedlist.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        //Summing values in a map.

        Map<String,Integer> fruits = new HashMap<String,Integer>();
        fruits.put("Apple",10);
        fruits.put("Banana", 3);
        fruits.put("Grapes", 23);
        Integer sumOfFruits = fruits.values().stream().reduce(Integer::sum).get();
        System.out.println("sumOfFruits : " + sumOfFruits);

        //creating map from stream;
        Map<String,Integer> chars = list.stream().distinct().collect(Collectors.toMap(x->x, x->x.length()));
        for (Entry<String,Integer> ent: chars.entrySet()) {
            System.out.println("ent : " + ent.getKey() + " - " + ent.getValue());
        }

        Map<Integer,Integer> cnts = listNum.stream().collect(Collectors.toMap(Function.identity(), v->1, (x,y)->x+y));
        for (Entry<Integer,Integer> ent: cnts.entrySet()) {
            System.out.println("entnum : " + ent.getKey() + " - " + ent.getValue());
        }
    }

}
