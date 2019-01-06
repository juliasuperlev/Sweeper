package com.itvdn.javaEssential.lesson_03.ex_004_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    public DerivedClass() {
    }

    public DerivedClass(int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}
