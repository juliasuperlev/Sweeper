package com.itvdn.javaEssential.lesson_03.ex_010_super_method;

public class DerivedClass extends BaseClass {

    @Override
    public void method() {
        super.method();
        System.out.println("method from DerivedClass");
    }
}
