package hw.bank.card;

import hw.bank.Account;

import java.util.Scanner;

public abstract class Card implements Transferable {
    protected final int CVC2;
    protected final String number;
    protected double balance;
    protected Account cardHolder;
    protected String expirationdate;
    protected int pinCode;

    private static final int KEY = 123;

    // пишемо конструктор з параметром
    protected Card(String number, int CVC2, double balance, Account cardholderName, String expirationdate, int pinCode) {
        this.CVC2 = CVC2;
        this.balance = balance;
        this.number = number;
        this.cardHolder = cardholderName;
        this.expirationdate = expirationdate;
        this.pinCode = pinCode;
    }

    // геттери та сеттери

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public Account getCardholder() {
        return cardHolder;
    }

    public void setCardholderName(Account cardholder) {
        this.cardHolder = cardHolder;
    }

    public String getExpirationdate() {
        return expirationdate;
    }


    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Input card holder name:");
            String name = new Scanner(System.in).nextLine();
            if (!this.cardHolder.getFullname().equalsIgnoreCase(name)) {
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

    protected boolean pinCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN code: ");
        int userPinCode = scanner.nextInt();
        if (userPinCode != pinCode) {
            System.out.println("Invalid PIN code.");
            return false;
        }
        return true;
    }

    @Override
    public void receive(double amount, int key) {
        if (key != KEY) {
            return;
        }
        balance += amount;
    }

    @Override
    public void send(double amount, int key) {
        if (key != KEY) {
            return;
        }
        if (this.balance > amount) {
            this.balance -= amount;
        }

    }
}

