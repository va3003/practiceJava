package com.Learning.practiceJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practiceIntermediateSteams {
	
	public static void main(String args[]) {
		Integer[] newIntAr = new Integer[10];
		
		Integer[] newIntArr = {10,3,6,18,21,33,88};
		List<Integer> newListInt = Arrays.asList(newIntArr);
			
		IntStream.range(1, 10).map(element->element*element).forEach(element->System.out.println(element));
		
		
		List<String> newListOfFruits = Arrays.asList(new String[] {"Apple","Ant","Bat"});
		newListOfFruits.stream().map(element -> element.toLowerCase()).forEach(element->System.out.println(element));
		
		newListOfFruits.stream().map(element -> element.length()).forEach(element->System.out.println(element));
	
		List<Integer> squares = newListInt.stream().map(element->element * element).collect(Collectors.toList());
		
		List<Integer> evenNumbersSquares = newListInt.stream().filter(element->element%2==0).map(element->element * element).collect(Collectors.toList());
		
		System.out.println("List of squares of even numbers");
		evenNumbersSquares.stream().forEach(new ConsumerInterface());
//		Consumer<? super Integer> action
//		Function<? super Integer, ? extends Integer
	}

}


class ConsumerInterface implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}