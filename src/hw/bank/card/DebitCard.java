package hw.bank.card;

import hw.bank.Account;

public class DebitCard extends Card {

    public DebitCard(String number, int CVC2, double balance, Account cardholderName, String expirationdate, int pinCode) {
        super(number, CVC2, balance, cardholderName, expirationdate, pinCode);
    }

    @Override
    public void send(double amount) {

    }

    @Override
    public void receive(double amount) {

    }
}
