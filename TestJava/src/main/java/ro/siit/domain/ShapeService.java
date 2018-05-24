package ro.siit.domain;

import java.util.List;

public class ShapeService {
    public double totalPerimeter(List<Shape> shapes) {
        double perimeter = 0;

        for (Shape shape : shapes) {
            perimeter = shape.perimeter();
        }
        return perimeter;
    }

    public double totalSurface(List<Shape> shapes) {
        double surface = 0;

        for (Shape shape : shapes) {
            surface = shape.surface();
        }
        return surface;
    }

    public boolean similarShapes(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.perimeter() == rectangle2.perimeter()){
            if (rectangle1.surface() == rectangle2.surface()){
                System.out.println("2 similar shapes couldn't be added");
            }
        }
        return true;
    }

    public boolean validate(List<Shape> shapes, Shape s){
        for (Shape shape : shapes){
            if (shape.perimeter() == s.perimeter()){
                System.out.println("couldn't be added");
            } else {
                return true;
            }
        }
        return false;
    }

}
