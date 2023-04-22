package lesson_polymorphism;

public abstract class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
