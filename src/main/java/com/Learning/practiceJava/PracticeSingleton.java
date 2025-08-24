package com.Learning.practiceJava;

public class PracticeSingleton {

	private static PracticeSingleton SingletonVar = null;
	

	private PracticeSingleton() {
		
	}
	
	public static PracticeSingleton getInstance() {
		
		if(SingletonVar==null)
			SingletonVar = new PracticeSingleton();
		return SingletonVar;
		
	}
	
}


class Main
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
    	PracticeSingleton x = PracticeSingleton.getInstance();
    }
}