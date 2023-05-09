package hw.bank.card;

import java.util.Scanner;

public class Card {
    protected final int CVC2;
    protected final String number;
    protected double balance;
    protected String cardholderName;
    protected String expirationdate;
    protected int pinCode;

    protected Card(String number, int CVC2, double balance, String cardholderName, String expirationdate, int pinCode) {
        this.CVC2 = CVC2;
        this.balance = balance;
        this.number = number;
        this.cardholderName = cardholderName;
        this.expirationdate = expirationdate;
        this.pinCode = pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }


    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getExpirationdate() {
        return expirationdate;
    }


    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Print card holder name:");
            String name = new Scanner(System.in).nextLine();
            if (!this.cardholderName.equalsIgnoreCase(name)) {
                return;
            }
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }

    public boolean pinCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN code: ");
        int userPinCode = scanner.nextInt();
        if (userPinCode != pinCode) {
            System.out.println("Invalid PIN code.");
            return false;
        }
        return true;
    }
}
