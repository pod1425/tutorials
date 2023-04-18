package hw.bank;

import java.util.Scanner;

public class Card {
    private final int CVC2;
    private final String number;
    private double balance;
    private String cardholderName;
    private String expirationdate;
    private int pinCode;

    public Card(String number, int CVC2, double balance, String cardholderName, String expirationdate, int pinCode) {
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

    public double getBalance() {
        return balance;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN code: ");
        int userPinCode = scanner.nextInt();
        if (userPinCode != pinCode) {
            System.out.println("Invalid PIN code.");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }

    }
}
