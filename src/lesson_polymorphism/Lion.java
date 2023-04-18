package lesson_polymorphism;

public class Lion extends Animal implements Talkable {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ROAAAAAAAAAAAR!!!");
    }
}
