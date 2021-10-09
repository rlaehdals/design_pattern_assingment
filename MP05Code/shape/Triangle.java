package shape;

import java.awt.*;

public class Triangle extends Shape {



    public Triangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double a = distance(points[0], points[1]);
        double b = distance(points[1], points[2]);
        double c = distance(points[2], points[0]);

        double s = (a+b+c)/2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double distance(Point point1, Point point2){
        return Math.abs(Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2)));
    }
    @Override
    public String toString() {
        return type + "\n"+"P0: "+points[0].toString()+
                "\nP1: "+points[1].toString()+
                "\nP2: "+points[2].toString()+
                "\n"+calcArea();
    }
}
