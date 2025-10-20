package com.Learning.practiceJava.designPatterns.practice;

public class SingletonPattern {

    private static SingletonPattern sp = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (sp == null) {
            sp = new SingletonPattern();
        }
        return sp;
    }

    public void simplemethod() {
        System.out.println("hash code of singleton object : " + sp);
    }

    public void simplemethod2() {
        System.out.println("hash code2 of singleton object : " + sp);
    }
}

class Test {
    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getInstance();
        sp.simplemethod();
        SingletonPattern sp2 = SingletonPattern.getInstance();
        sp2.simplemethod();

    }
}