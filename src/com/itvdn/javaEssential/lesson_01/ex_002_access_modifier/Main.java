package com.itvdn.javaEssential.lesson_01.ex_002_access_modifier;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.square = 24.0;
        System.out.println(shape.square);

        shape.setHeight(200);
        shape.getHeight();

        shape.setLenght(144);
        shape.getLenght();

        shape.viewShape();
    }
}
