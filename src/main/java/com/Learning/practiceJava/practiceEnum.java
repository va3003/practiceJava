package com.Learning.practiceJava;

import java.util.Arrays;

import java.util.List;

 enum Season {
	Summer(5), Winter(6), Spring(7), Fall(8);
	private int id;
	
	Season(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

public class practiceEnum {

	

	public static void main(String args[]) {
		System.out.println(Season.valueOf("Summer"));
		
		List<Season> seasons = Arrays.asList(Season.values());
		System.out.println(seasons);

		System.out.println(Season.valueOf("Summer").getId());
		
		
		
	}

}
