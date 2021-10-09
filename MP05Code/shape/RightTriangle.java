package shape;

import java.awt.*;

public class RightTriangle extends Shape {
    public RightTriangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        Point point1 = points[0];
        Point point2 = points[1];
        Point point3 = points[2];
        double a = Math.abs(Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2)));
        double b = Math.abs(Math.sqrt(Math.pow(point3.x - point2.x, 2) + Math.pow(point3.y - point2.y, 2)));
        double c = Math.abs(Math.sqrt(Math.pow(point1.x - point3.x, 2) + Math.pow(point1.y - point3.y, 2)));
        if(a>b){
            if(a>c){
                return (b*c)/2;
            }
            else{
                return (a*b)/2;
            }
        }
        else{
            if(b>c){
                return (c*a)/2;
            }
            else{
                return (a*b)/2;
            }
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
