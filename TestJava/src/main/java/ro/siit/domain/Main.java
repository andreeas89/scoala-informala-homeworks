package ro.siit.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2, 5);
        System.out.println(rectangle1.perimeter() + "  " + rectangle1.surface());
        Rectangle rectangle2 = new Rectangle(4, 6);
        Square square1 = new Square(4);
        Triangle triangle1 = new Triangle(2, 4, 6);
        Triangle triangle2 = new Triangle(5, 7, 3);
        Circle circle1 = new Circle(5);

        ShapeService shapeService = new ShapeService();
        List<Shape> shapes = new ArrayList<Shape>();
        if (shapeService.validate(shapes, rectangle1) == true){
            shapes.add(rectangle1);
        }

        shapes.add(rectangle2);
        shapes.add(square1);
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(circle1);

        System.out.println("total perimeter = " + shapeService.totalPerimeter(shapes));
        System.out.println("total perimeter = " + shapeService.totalSurface(shapes));


    }


}


