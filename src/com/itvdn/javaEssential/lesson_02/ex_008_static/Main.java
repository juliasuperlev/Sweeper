package com.itvdn.javaEssential.lesson_02.ex_008_static;

public class Main {
    private int count;

    public static void main(String[] args) {
        Main.doSmth();
        doSmth();

        Main m = new Main();
        System.out.println(m.count);

    }

    public static void doSmth() {
        System.out.println("Hello!");
    }
}
