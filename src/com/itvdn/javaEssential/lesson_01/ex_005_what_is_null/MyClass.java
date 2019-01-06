package com.itvdn.javaEssential.lesson_01.ex_005_what_is_null;

import com.itvdn.javaEssential.lesson_01.ex_004_method_calling.Car;

public class MyClass {
    public static void main(String[] args) {
        String str1 = null;
        Car car1 = null;

        String str2 = (String) null;
        Car car2 = (Car) null;

        System.out.println(null == null);
        System.out.println(car1 == null);

        car1.getMaxSpeed();
    }
}
