package lesson_polymorphism;

public class Demo {

    private static void makeAnimalSpeak(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Terier");
        Animal lion = new Lion("Mountain Lion");
        makeAnimalSpeak(lion);
    }
}
