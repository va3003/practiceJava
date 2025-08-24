package com.Learning.practiceJava;

public class Animal {

	protected String name;

	Animal(){};
	
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void runs() {
		System.out.println("Animal " + name + " Runs");
	}

}
