package shape;

import java.awt.*;

public class Trapezoid extends Shape {
    public Trapezoid(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        Point point1 = points[0];
        Point point2 = points[1];
        Point point3 = points[2];
        Point point4 = points[3];
        if(point1.y==point2.y){
            int width1 = Math.abs(point1.x - point2.x);
            int width2 = Math.abs(point3.x - point4.x);
            int height = Math.abs(point1.y - point3.y);
            return ((width1+width2)*height)/2;
        }
        else if(point1.y==point3.y){
            int width1 = Math.abs(point1.x - point3.x);
            int width2 = Math.abs(point2.x - point4.x);
            int height = Math.abs(point1.y - point2.y);
            return ((width1+width2)*height)/2;
        }
        else{
            int width1 = Math.abs(point1.x - point4.x);
            int width2 = Math.abs(point3.x - point2.x);
            int height = Math.abs(point1.y - point3.y);
            return ((width1+width2)*height)/2;
        }
    }
    @Override
    public String toString() {
        return type + "\n"+"P0: "+points[0].toString()+
                "\nP1: "+points[1].toString()+
                "\nP2: "+points[2].toString()+
                "\n"+calcArea();
    }
}
