package shape;

import java.awt.*;

public class Parallelogram extends Shape {


    public Parallelogram(String type, Point[] points) {
        super(type, points);

    }

    @Override
    public double calcArea() {
        Point point1 = points[0];
        Point point2 = points[1];
        Point point3 = points[2];
        Point point4 = points[3];
        if(point1.y==point2.y){
            int width = Math.abs(point1.x - point2.x);
            int height = Math.abs(point1.y - point3.y);
            return width*height;
        }
        else if(point1.y==point3.y){
            int width = Math.abs(point1.x - point3.x);
            int height = Math.abs(point1.y - point2.y);
            return width*height;
        }
        else{
            int width = Math.abs(point1.x - point4.x);
            int height = Math.abs(point1.y - point3.y);
            return width*height;
        }
    }

    @Override
    public String toString() {
        return type + "\n"+"P0: "+points[0].toString()+
                "\nP1: "+points[1].toString()+
                "\nP2: "+points[2].toString()+
                "\nP3: "+points[3].toString()
                +"\n"+calcArea();
    }
}
