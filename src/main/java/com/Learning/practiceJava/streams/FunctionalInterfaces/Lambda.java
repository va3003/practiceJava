package com.Learning.practiceJava.streams.FunctionalInterfaces;

public class Lambda {
    
    public static void main(String[] args) {
        MathOperation sumOperation = (a,b) -> a + b;
        System.out.println(sumOperation.operate(3, 2));

        MathOperation subtractOperation = (a,b) -> a-b;
        System.out.println(subtractOperation.operate(3, 2));

    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
