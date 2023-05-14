package practice.p2;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    // (1.0;2.0;3.0)
    public String toString() {
        return "(" + x + ";" + y + ";" + z + ")";
    }
}
