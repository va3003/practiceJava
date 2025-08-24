package com.Learning.practiceJava;

import java.util.Arrays;
import java.util.List;

public class practiceStreams {

	public static void main(String args[]) {
		
		Integer[] arrNew = { 4, 6, 9, 2, 1 };
		List<Integer> newList = Arrays.asList(arrNew);
		System.out.println("Print all numbers");
		newList.stream().forEach(element -> System.out.println(element));
		System.out.println();

		System.out.println("Print odd numbers");
		newList.stream().filter(element->(element % 2)==1).forEach(element -> System.out.println(element));
		System.out.println();
		
		System.out.println("Print even numbers");
		newList.stream().filter(element->(element % 2)==0).forEach(element -> System.out.println(element));
		System.out.println();
		
		System.out.println("Sum of all integers : " + newList.stream().reduce(0, (number1,number2) -> number1 + number2));
		
		System.out.println("Sum of odd integers : " + newList.stream().filter(element->element%2==1).reduce(0, (number1,number2) -> number1 + number2));
		
		
	}
}
