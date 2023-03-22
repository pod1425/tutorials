package lesson4;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 7;

        System.out.println(p1);
        System.out.println(p2);

        Human mark = new Human("Mark", 187, 75.5);
        mark.talk();
    }
}
