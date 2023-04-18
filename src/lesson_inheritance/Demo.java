package lesson_inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        Vegetable onion = new Vegetable("Onion", 15, "11.06.2023");
        System.out.println(onion);
        IntStream.rangeClosed(1, args.length)
                .mapToObj(i -> args[args.length - i])
                .toArray(String[]::new);

    }
}
