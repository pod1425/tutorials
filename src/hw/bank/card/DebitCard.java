package hw.bank.card;

public class DebitCard extends Card {

    public DebitCard(String number, int CVC2, double balance, String cardholderName, String expirationdate, int pinCode) {
        super(number, CVC2, balance, cardholderName, expirationdate, pinCode);
    }
}
