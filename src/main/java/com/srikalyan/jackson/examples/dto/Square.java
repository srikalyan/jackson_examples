package com.srikalyan.jackson.examples.dto;

/**
 * @author srikalyan.swayampakula
 */
public class Square implements Shape {
    private static final String NAME = "Square";

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
