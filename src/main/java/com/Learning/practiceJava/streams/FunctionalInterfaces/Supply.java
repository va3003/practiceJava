package com.Learning.practiceJava.streams.FunctionalInterfaces;

import java.util.function.Supplier;

public class Supply {
    
    public static void main(String[] args) {
        
        Supplier<String> giveHelloWorld = () -> "helloworld";
        System.out.println(giveHelloWorld.get());
    }
}
