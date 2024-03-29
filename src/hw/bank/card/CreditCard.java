package hw.bank.card;

import hw.bank.Account;

public class CreditCard extends Card {
    private double debt;
    private double limit;

    public CreditCard(String number, int CVC2, double balance, Account cardholderName, String expirationdate, int pinCode) {
        super(number, CVC2, balance, cardholderName, expirationdate, pinCode);
        debt = 0;
        limit = 10000;
    }

    @Override
    public void deposit(double amount) {
        if (debt > 0) {
            debt -= amount;
        }
        if (debt < 0) {
            amount = -debt;
            super.deposit(amount);
        }
    }

    public double getDebt() {
        return debt;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        if (debt > limit) {
            return;
        }
        this.limit = limit;
    }

    public void credit(double amount) {
        if (!super.pinCode()) {
            return;
        }
        this.debt += amount;
        this.balance += amount;
    }

    @Override
    public void send(double amount) {

    }

    @Override
    public void receive(double amount) {

    }
}

