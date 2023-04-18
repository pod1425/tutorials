package lesson_polymorphism;

public class Demo {

    private static void makeAnimalSpeak(Animal animal) {
        if (animal instanceof Talkable) {
            Talkable loudAnimal = (Talkable) animal;
            loudAnimal.makeSound();
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Terier");
        Animal lion = new Lion("Mountain Lion");
        makeAnimalSpeak(dog);
    }
}
