package com.itvdn.javaEssential.lesson_03.ex_011_final_class;

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + " y = " + instance.y);
    }
}
