package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public String getFigure(int i){
        return figures.get(i).getShapeName();
    }

    public double showFigures(int i){
        return figures.get(i).getField();
    }
}
