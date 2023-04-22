package hw.bank.card;

public class CreditCard extends Card {

    public CreditCard(String number, int CVC2, double balance, String cardholderName, String expirationdate, int pinCode) {
        super(number, CVC2, balance, cardholderName, expirationdate, pinCode);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
}

