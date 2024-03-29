package practice.p1;

import practice.p2.Point;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle(Point center, double radius, String color, boolean filled) {
        super("circle", color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getAreaString() {
        return Math.pow(radius, 2) + " Pi";
    }
    public String getPerimeterString() {
        return (2 * radius) + " Pi";
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }
}
