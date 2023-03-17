package hw.bank;

import java.time.LocalDate;

public class Card {

    String number;
    LocalDate expirationDate;
    int cvc2;
    int amount;
    String fullName;

    Card(String number, LocalDate expirationDate, int cvc2, int amount, String fullName) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvc2 = cvc2;
        this.amount = amount;
        this.fullName = fullName;
    }

    public String toString() {
        return "Card Number: " + number + ", Expiration Date: " + expirationDate + ", CVC2: " + cvc2 + ", Amount: " + amount + ", Full Name: " + fullName;
    }

    public static void main(String[] args) {
        Card myAccount = new Card("1234 5678 9012 3456", LocalDate.of(2025, 12, 31), 123, 112, "John Duk");
        System.out.println(myAccount.toString());
    }
}
