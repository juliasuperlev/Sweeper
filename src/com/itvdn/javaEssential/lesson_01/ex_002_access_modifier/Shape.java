package com.itvdn.javaEssential.lesson_01.ex_002_access_modifier;

public class Shape {
    private int lenght;
    private long height;
    public double square;

    public int i;
    public float f;
    public boolean b;
    public char c;

    public Shape() {

    }

    public int getLenght() { return lenght; };

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void viewShape() {
        System.out.println("Height " + height);
        System.out.println("Length " + lenght);
    }
}
