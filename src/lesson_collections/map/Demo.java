package lesson_collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("Apples", 20);
        prices.put("Pomelo", 110);
        prices.put("Tangerine", 80);

        for (var key : prices.keySet()) {
            System.out.println(key + ": " + prices.get(key));
        }
        Scanner scanner = new Scanner(System.in);
       //System.out.println("Enter fruit and new price");
        String fruit = "Orange";
        int price = 90;

        Integer oldValue = prices.put(fruit, price);
        if (oldValue != null) {
            System.out.println("Changed price for " + fruit + ", old price was " + oldValue);
        } else {
            System.out.println("Added new fruit: " + fruit);
        }

        for (var entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(prices.getOrDefault("Orange", 0));
        System.out.println(prices.getOrDefault("Cherry", 0));
        System.out.println(prices.get("Cherry"));
        
    }
}
