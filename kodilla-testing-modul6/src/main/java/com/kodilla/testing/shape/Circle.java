package com.kodilla.testing.shape;

public class Circle implements Shape {
   double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {

        return "KOŁO";
    }

    @Override
    public double getField() {

        return Math.PI*(r*r);
    }
}
