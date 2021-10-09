package shape;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        Point point1 = points[0];
        Point point2 = points[1];

        int width = Math.abs(point1.x - point2.x);
        int height = Math.abs(point1.y - point2.y);
        return width*height;
    }
    @Override
    public String toString() {
        Point point1 = points[0];
        Point point2 = points[1];
        Point point3 = new Point(point1.x,point2.y);
        Point point4 = new Point(point2.x,point1.y);
        return type + "\n"+"P0: "+point1.toString()+
                "\nP1: "+point2.toString()+
                "\nP2: "+point3.toString()+
                "\nP3: "+point4.toString()
                +"\n"+calcArea();
    }
}
