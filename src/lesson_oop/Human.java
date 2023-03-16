package lesson_oop;

public class Human {
    String name;
    double weight; // в кілограмах
    int height; // в сантиметрах

    Human() {
        name = "NULL";
        weight = -1;
        height = -1;
    }

    Human(String name, double weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void talk() {
        System.out.println("Hello, my name is " + this.name + ", my height is "
                + this.height + ", and my weight is " + this.weight);
    }

    public String toString() {
        return this.name + " height: " + this.height
                + " weight: " + this.weight;
    }
}
