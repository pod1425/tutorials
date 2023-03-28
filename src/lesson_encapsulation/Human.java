package lesson_encapsulation;

public class Human {
    private double weight;
    private int height;
    private String name;

    public Human() {
        this.weight = -1;
        this.height = 0;
        this.name = "NULL";
    }

    public Human(String name, int height, double weight) {
        setWeight(weight);
        setName(name);
        setHeight(height);
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error! Weight cant be less than zero!");
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error! Height cant be less than zero!");
        }
    }

    public void talk() {
        System.out.println(this.name + " says: Hello!");
    }

}
