package factory;


import shape.Shape;

import java.awt.*;

public interface ShapeFactory {

    Shape create(String type, Point[] points);

}
