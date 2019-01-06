package com.itvdn.javaEssential.lesson_01.ex_001_class_declaration;

public class Car {
    protected String model;
    private int maxSpeed;
    private int year;
    private int speed;

    public Car () {

    }

    public Car(String model, int maxSpeed, int year, int speed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public int getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
