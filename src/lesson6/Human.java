package lesson6;

public class Human {
    public double weight;
    public int height;
    public String name;

    public Human() {
        this.weight = -1;
        this.height = 0;
        this.name = "NULL";
    }

    public Human(String name, int height, double weight) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public void talk() {
        System.out.println(this.name + " says: Hello!");
    }

}
