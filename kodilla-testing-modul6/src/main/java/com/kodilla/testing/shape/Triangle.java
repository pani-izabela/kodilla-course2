package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {

        return "TRÓJKĄT";
    }

    @Override
    public double getField() {

        return (a*h)/2;
    }
}
