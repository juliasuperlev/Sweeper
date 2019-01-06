package com.itvdn.javaEssential.lesson_03.ex_003_constructors;

public class DerivedClass extends BaseClass{
    public int derivedField;

    public DerivedClass(int number1, int number2) {
        baseNumber = number1;
        derivedField = number2;
    }
}
