package com.itvdn.javaEssential.lesson_01.ex_004_method_calling;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200, 10, 100);
        Car car2 = new Car();

        System.out.println(car1.getMaxSpeed());

        System.out.println(car1);
        System.out.println(car2);

        car1.setMaxSpeed(140);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);

        car2.setMaxSpeed(150);
        System.out.println(car2.getMaxSpeed());
    }
}
