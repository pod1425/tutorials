package practice.p1;

public abstract class Shape {
    protected String name;
    protected String color;
    protected boolean filled;

    protected Shape(String name, String color, boolean filled) {
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (filled ? "filled " : "hollow ")
                + color + " " + name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
