package com.Learning.practiceJava;

public class TestSuper {

}
class Parent{
    private int num = 1;
    
    Parent(){
        System.out.println("Parent class default constructor.");
    }
    
    Parent(String x){
        System.out.println("Parent class parameterised constructor.");
    }
    
    public void foo(){
        System.out.println("Parent class foo!");
    }
}
 class Child extends Parent{
    private int num = 2;
    
    Child(){
    	super();    // to call default parent constructor
//        super("Call Parent");    // to call parameterised constructor.
        System.out.println("Child class default Constructor");
        
        
    }
    
    void printNum(){
        System.out.println(num);
//        System.out.println(super.num); //prints the value of num of parent class
    }
    
    @Override
    public void foo(){
        System.out.println("Parent class foo!");
        super.foo();    //Calls foo method of Parent class inside the Overriden foo method of Child class.
    }
}
