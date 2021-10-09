package factory;


import shape.RightTriangle;
import shape.Shape;
import shape.Triangle;

import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory{

    shape.Shape shape;

    @Override
    public Shape create(String type, Point[] points) {
        if(type.equals("Triangle")){
            shape= new Triangle(type,points);
        }
        else{
            shape = new RightTriangle(type,points);
        }
        return shape;
    }
}
