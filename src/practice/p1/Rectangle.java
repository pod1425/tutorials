package practice.p1;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super("rectangle", color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + ", width = " + width
                + ", height = " + height;
    }
}
