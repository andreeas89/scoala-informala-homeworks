package ro.siit.domain;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2* Math.PI * this.radius;
    }

    public double surface() {
        return Math.PI * this.radius * this.radius;
    }
}
