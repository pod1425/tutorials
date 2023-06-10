package practice;

import practice.p1.Circle;
import practice.p1.Rectangle;
import practice.p1.Shape;
import practice.p2.Point;

import java.io.File;

class SomeClass {
    public int value;
}

public class Demo {
    public static void main(String[] args) {
        SomeClass obj1 = new SomeClass();
        obj1.value = 5;
        SomeClass obj2 = obj1;
        obj2.value = 15;
        System.out.println(obj1.value);
        System.out.println(obj2.value);
    }

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

}













