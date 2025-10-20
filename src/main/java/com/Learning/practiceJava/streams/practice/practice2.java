package com.Learning.practiceJava.streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice2 {

    // given a sentence, find words with specified number of vowels.
    // no. of vowels : 2;

    public static void main(String[] args) {
        String sentence = "1 am learning stream ap1 in java9";
        List<String> listSent = Arrays.asList(sentence.split(" "));
        long count = listSent.stream().filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2).count();
        System.out.println("count : " + count);
        long count2 = listSent.stream().filter(x -> x.replaceAll("[^0-9]", "").length() > 0).count();
        System.out.println("count2 : " + count2);

        // check if its a mobile number
        String strMobNum = "91";
        System.out.println("strMobNum : " + strMobNum);
        boolean b = strMobNum.matches("0-9");
        System.out.println("matches num : " + b);

        //
        int[] arr = { 1, 2, 4, 5, 6 };
        List<Integer> abcd = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("abcd : " + abcd);

        // given a word find the occurence of each char

        String word = "sentences";
        Map<Object, Long> lstN = word.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("listN :" + lstN);

        char[] arrch = word.toCharArray();
        Map<Character, Integer> mapCh = new HashMap<Character, Integer>();

        for (int i = 0; i < arrch.length; i++) {
            if (mapCh.containsKey(arrch[i])) {
                int tempVal = mapCh.get(arrch[i]);
                mapCh.put(arrch[i], tempVal + 1);
            } else {
                mapCh.put(arrch[i], 1);
            }

        }
        for (Entry<Character, Integer> ent : mapCh.entrySet()) {
            System.out.printf("Key : %s and Entry : %s \n", ent.getKey(), ent.getValue());
        }

        String[] sp = word.split("");
        Map<String, Long> mapCnt = Arrays.stream(sp).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(mapCnt);

        // rearrange elements from highest to lowest

        int[] arr1 = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("arr1 : ");
        for (int l : arr1) {
            System.out.println(l);
        }
        System.out.println("sorted : ");

        List<Integer> listForSort = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        for (Integer integer : listForSort) {
            System.out.println(integer);
        }
        System.out.println("sorted against : ");

        listForSort.sort(Comparator.naturalOrder());
        for (Integer integer : listForSort) {
            System.out.println(integer);
        }

        // check leap year
        // print pyramid
        // char ch = '*';

        // for(int i=5;i>=0;i--){
        // for(int j=0;j<i/2;i++){
        // System.out.print(' ');
        // }
        // for(int k =i/2;k<=j/2;k++){
        // System.out.println(ch);
        // }
        // for()
        // }

        // given an array.. find sum of unique elements.
        int[] arrUn = { 1, 2, 3, 4, 5, 3, 4 };
        Stream<Integer> listArr = Arrays.stream(arrUn).boxed();
        int sumOfArrUn = listArr.distinct().reduce((x, y) -> x + y).get();
        System.out.println("sumOfArrUn : " + sumOfArrUn);

        int[] arrUn2 = { 1, 2, 3, 4, 5, 3, 4 };
        Set<Integer> arrUnList = new HashSet<Integer>();
        for (int i = 0; i < arrUn2.length; i++) {
            if (!arrUnList.contains(arrUn2[i])) {
                arrUnList.add(arrUn2[i]);
            }
        }

        int sumSet = 0;
        for (Integer integer : arrUnList) {
            sumSet = sumSet + integer;
        }
        
        System.out.println("sumSet : " + sumSet);


        String word2 = "sentences";
        String[] word2split = word2.split("");
        List<String> word2List = Arrays.asList(word2split);


        
    }
}
