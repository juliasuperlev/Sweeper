package com.itvdn.javaEssential.lesson_01.ex_011_packages06_import_static;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {

        double number = 1;
        double result = cos(PI * number);
        System.out.println(result);
    }
}
