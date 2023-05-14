package hw.bank;

import hw.bank.card.Card;
import hw.bank.card.DebitCard;

public class Demo {

    public static void main(String[] args) {

        Card card = new DebitCard("4144323437239683", 123, 1000, "Jack Hammer", "05/29", 1111);
        System.out.println("Balance: " + card.getBalance());
        System.out.println("Depositing 500 money...");
        card.deposit(500);
        System.out.println("Updated balance: " + card.getBalance());

        System.out.println("Withdrawing 700 money...");
        card.withdraw(700);
        System.out.println("Updated balance: " + card.getBalance());

        System.out.println("Withdrawing 2000 more money...");
        card.withdraw(2000);
        System.out.println("Updated balance: " + card.getBalance());
    }
}
