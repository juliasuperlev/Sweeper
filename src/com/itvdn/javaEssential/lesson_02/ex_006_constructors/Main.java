package com.itvdn.javaEssential.lesson_02.ex_006_constructors;

public class Main {
    public static void main(String[] args) {
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(22);
        Animal animalWithTwoParameters = new Animal(23, 61);

        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());

    }
}
