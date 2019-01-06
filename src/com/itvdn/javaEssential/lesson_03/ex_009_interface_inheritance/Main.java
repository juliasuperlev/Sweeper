package com.itvdn.javaEssential.lesson_03.ex_009_interface_inheritance;

import com.itvdn.javaEssential.lesson_03.ex_008_interface_inheritance.SomeInterface;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();

        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();

        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();

        SomeInterface3 instanceUp3 = instance;
        instanceUp3.method3();

        SomeClass instancesDown = (SomeClass) instanceUp1;
        instancesDown.method1();
    }
}
