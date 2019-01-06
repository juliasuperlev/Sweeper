package com.itvdn.patterns.builder;

class Director {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder cBuilder) {
        this.computerBuilder = cBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.createNewComputer();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
    }
}
