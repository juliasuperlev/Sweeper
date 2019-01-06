package com.itvdn.javaEssential.lesson_03.ex_008_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method();
        System.out.println(instance.publicField);

        SomeInterface instanceUp = instance;
        instanceUp.method();

        SomeClass instanceDown = (SomeClass) instanceUp;
        instanceDown.method();
        System.out.println(instanceDown.publicField);
    }
}
