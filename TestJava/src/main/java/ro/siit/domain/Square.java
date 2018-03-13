package ro.siit.domain;

public class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double perimeter() {
        return 4 * this.width;
    }

    public double surface() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
