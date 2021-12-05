package factory;

import shape.Parallelogram;
import shape.Rectangle;
import shape.Shape;
import shape.Trapezoid;

import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory{

    shape.Shape shape;

    @Override
    public Shape create(String type, Point[] points) {

        if(type.equals("Rectangle")){
            shape=new Rectangle(type, points);
        }
        else if(type.equals("Trapezoid")){
            shape=new Trapezoid(type,points);
        }
        else{
            shape=new Parallelogram(type,points);
        }
        return shape;
    }
}
