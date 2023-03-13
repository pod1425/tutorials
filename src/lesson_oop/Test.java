package lesson_oop;

class Human {
    String name;
    int age;
    double height;

    Human() {
        name = "";
        age = 0;
        height = 0;
    }

    Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString(){
        return "Name: " + this.name + ", age: "
                + this.age + ", height: " + this.height;
    }
}

class Rectangle {
    double length;
    double height;

    Rectangle() {
        height = 0;
        length = 0;
    }

    Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    double getPerimeter() {
        return 2 * (length + height);
    }

    double getSquare() {
        return length * height;
    }

    double getDiagonal() {
        return Math.sqrt(length * length + height * height);
    }

    public String toString() {
        return "Length = " + this.length + " Height = " + this.height;
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 3);
        System.out.println(rect);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getSquare());
        System.out.println(rect.getDiagonal());
    }
}
