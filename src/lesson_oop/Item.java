package lesson_oop;

public class Item {
    long id;
    String name;
    float price;
    double weight;
    String color;

    public Item(long id, String name, float price, double weight, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", price: " + price + " UAH, weight: "
                + weight + "kg, color: " + color;
    }

    public boolean equals(Object obj) {
        Item cmp = (Item) obj;
        return this.id == cmp.id
                && this.name.equals(cmp.name)
                && this.price == cmp.price
                && this.weight == cmp.weight
                && this.color.equals(cmp.color);
    }
}
