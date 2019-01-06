package com.itvdn.javaEssential.lesson_03.ex_012_final_methods;

public class ClassB extends ClassA {
    @Override
    public final void method1() {
        System.out.println("ClassB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB.method2");
    }
}
