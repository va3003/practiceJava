package com.Learning.practiceJava;

public class InnerClass {

	public static void main(String args[]) {
		Test ts = new Test(10);
		Test.InnerTestClass ti = ts.new InnerTestClass();
		System.out.println(ti.getValue());
		
		System.out.println(Test.InnerMulClass.getValue(ts));
	}
}

class Test {
	
	private int num;
	static int count=1;
	
	Test(int i){
		num = i;
		count= count + 2;
	}
	
	class InnerTestClass {
		
		
		int getValue() {
			return num;
		}
		
	}
	
	static class InnerMulClass {
		
		
		static int getValue(Test ts) {
			return ts.num*count;
		}
		
	}
}
