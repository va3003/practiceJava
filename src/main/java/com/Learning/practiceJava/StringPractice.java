package com.Learning.practiceJava;

public class StringPractice {

	public static void main(String args[]) {
		String someString = "This is a lot of text";
		for(int i=0; i<someString.length(); i ++) {
			System.out.println(someString.charAt(i));
		}
		
		System.out.println(someString.indexOf("lot"));
		
		
		StringBuffer sbTest = new StringBuffer();
		sbTest.append("test123");
		
		
		String someString2 = "This is a lot of text";
		char[] someStringArr = someString2.toCharArray();
		char[] reverseSomeStringArr = new char[someStringArr.length];
		
		
		
	}
	
}
