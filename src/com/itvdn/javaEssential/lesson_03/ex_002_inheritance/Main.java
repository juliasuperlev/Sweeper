package com.itvdn.javaEssential.lesson_03.ex_002_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        System.out.println(instance.publicField);
        instance.show();
    }
}
