package lesson_polymorphism;

public class Dog extends Animal implements Talkable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Bark bark!");
    }
}
