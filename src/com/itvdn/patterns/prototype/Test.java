package com.itvdn.patterns.prototype;

public class Test {
    public static void main(String[] args) {
        ComplicatedObject clone = new ComplicatedObject().copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }
}
