package com.Learning.practiceJava;

public class practiceAbstraction {
	public static void main(String args[]) {
		Sum a1 = new IntegerSum();
		System.out.println("IntegerSum : " + a1.addition(2, 3));
		
		Sum a2 = new WorldSum();
		System.out.println("WorldSum : " + a2.addition(2, 3));
	}
}


abstract class Sum{
	public abstract int addition(int a, int b);
}

class IntegerSum extends Sum{

	@Override
	public int addition(int a, int b) {
		return a + b;
	}
	
}

class WorldSum extends Sum{

	@Override
	public int addition(int a, int b) {
		System.out.println("WSUM " + a + b);
		return 0;
	}
	
}

interface ISum{
	
}