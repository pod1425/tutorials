package practice;

import practice.p1.Circle;
import practice.p1.Rectangle;
import practice.p1.Shape;
import practice.p2.Point;

public class Demo {

    public static void testShapes() {
        Shape rect = new Rectangle(10, 15, "blue", false);
        System.out.println(rect);
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
        Shape circle = new Circle(new Point(1, 1, 1), 8, "yellow", true);
        System.out.println(circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        if (circle instanceof Circle) {
            Circle c = (Circle) circle;
            System.out.println("Perimeter: " + c.getPerimeterString());
            System.out.println("Area: " + c.getAreaString());
        }
    }

    public static void main(String[] args) {
        Point p = new Point(1.0, 2.0, 3.0);
        String text = p.toString();
        System.out.println(text);
    }
}
