package hw.bank;

import hw.bank.card.Card;
import hw.bank.card.CreditCard;
import hw.bank.card.DebitCard;

public class Demo {

    public static void main(String[] args) {
        Card card = new DebitCard("4144323437239683", 123, 1000, new Account("", "", "", "", 21), "05/29", 1111);


    }
}
