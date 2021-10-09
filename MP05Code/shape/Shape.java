package shape;

import java.awt.*;
import java.util.Arrays;

public abstract class Shape {
    public Point[] points;
    public String type;
    public Shape(String type, Point[] points){
        this.type=type;
        this.points=points;

    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
