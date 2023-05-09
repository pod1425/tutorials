package lesson6_7;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ROAAAAAAAAAAAR!!!");
    }
}
