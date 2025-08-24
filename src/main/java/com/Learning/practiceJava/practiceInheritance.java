package com.Learning.practiceJava;

public class practiceInheritance {

	//Is-A relationship = a1 is of type Animal -> instanceOf Animal
	public static void main(String args[]) {
		Animal a1 = new Animal("Animal 1");

		Pet p1 = new Pet("Pet 1", 10);

		Animal a2 = new Pet("Pet 2", 3);

		a1.runs();
		p1.runs();
		a2.runs();
		
		System.out.println("a1 instanceof Animal " + (a1 instanceof Animal));
		System.out.println("a1 instanceof Pet " + (a1 instanceof Pet));
		System.out.println("p1 instanceof Animal " + (p1 instanceof Animal));
		System.out.println("p1 instanceof Pet " + (p1 instanceof Pet));
		System.out.println("a2 instanceof Animal " + (a2 instanceof Animal));
		System.out.println("a2 instanceof Pet " + (a2 instanceof Pet));


	}
}
