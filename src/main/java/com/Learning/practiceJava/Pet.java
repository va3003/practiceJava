package com.Learning.practiceJava;

public class Pet extends Animal{
	
	private int age;
	
	Pet(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void runs() {
		System.out.println("Pet " + name + " Runs at age : " + age);
	}
}
