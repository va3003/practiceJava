package com.Learning.practiceJava.streams.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice1 {

    public static void main(String[] args) {

        // given a sentence. find the word with highest length.
        String sent1 = "I am learning streaming Api in Java";
        List<String> sentList = Arrays.asList(sent1.split(" "));
        Optional<String> maxString = sentList.stream().collect(Collectors.maxBy(Comparator.comparing(x -> x.length())));
        System.out.println(maxString.get());


        String maxString2 = sentList.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(maxString2);


        //find the word with 2nd highest length
        Stream<String> sentStream = Arrays.stream(sent1.split(" "));
        String secondLongestElement = sentStream.sorted(Comparator.comparing(x->x.length())).skip(sentList.size()-2).findFirst().get();
        System.out.println("secondLongestElement : " + secondLongestElement);

        Stream<String> sentStream2 = Arrays.stream(sent1.split(" "));
        String secondLongestElement2 = sentStream2.sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println("secondLongestElement2 : " + secondLongestElement2);


        //length
        Stream<String> sentStream3 = Arrays.stream(sent1.split(" "));
        Integer secondLongestElement3 =  sentStream3.map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondLongestElement3 : " + secondLongestElement3);


        //remove duplicates from the string
        String sent2 = "I eat apple and eat banana";
        Stream<String> splitSent = Arrays.stream(sent2.split(" "));
        String splitSent2 = splitSent.distinct().collect(Collectors.joining(" "));
        System.out.println(splitSent2);

        //given sentence find occurence of each word.
        Stream<String> splitSent3 = Arrays.stream(sent2.split(" "));
        //below - x->x can be replaced by Function.identity()
        Map<Object,Long> str2 = splitSent3.collect(Collectors.groupingBy(x->x,Collectors.counting()));
        for(Entry<Object,Long> str : str2.entrySet()){
            System.out.println("count of words : " + str.getKey() + " - " + str.getValue());
        }

    }

}
