package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testFigureShape(){
        Shape shape = new Circle(5);
        String nameFigure = shape.getShapeName();
        Assert.assertEquals("KOŁO", nameFigure);
    }

    @Test
    public void getFigure(){
        Shape shapeCircle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shapeCircle);
        int no = shapeCollector.getFigures().size();
        Assert.assertEquals(1, no);
    }

    @Test
    public void removeFigure(){
        Shape shapeCircle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shapeCircle);
        int no = shapeCollector.getFigures().size();
        Assert.assertEquals(1, no);

        shapeCollector.removeFigure(shapeCircle);
        int noAfterDelete = shapeCollector.getFigures().size();
        Assert.assertEquals(0, noAfterDelete);
    }



    @Test
    public void getFigureTest(){
        Shape shapeSquare = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shapeSquare);
        double field = shapeCollector.showFigures(0);
        Assert.assertEquals(25, field, 0);
    }
}
