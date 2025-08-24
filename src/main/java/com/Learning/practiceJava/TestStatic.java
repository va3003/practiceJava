package com.Learning.practiceJava;

public class TestStatic {

	static int i = 0;
	String name = "kunal";
	
	public void add(int i,int j) {
		System.out.println("Sum : " + i + j);
		i = i + 1;
		name = "kavita";
		TestStatic.i = 10;
	}
	
	public static void main(String args[]) {
		i = i + 1;
		TestStatic ts = new TestStatic();
		ts.add(10, 11);
		ts.name = "sunay";
	}
	
}
