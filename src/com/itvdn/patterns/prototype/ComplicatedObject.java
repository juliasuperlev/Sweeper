package com.itvdn.patterns.prototype;

import java.lang.reflect.Type;

public class ComplicatedObject implements Copyable {
    public enum Type {ONE, TWO}

    @Override
    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type) {
//        this.type = type;
    }
}
