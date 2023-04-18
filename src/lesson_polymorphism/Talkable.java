package lesson_polymorphism;

public interface Talkable {
    void makeSound();

    default void foo() {
        System.out.println("This method you called is useless!!");
    }
}
