package hw.bank;

import hw.bank.card.Card;

public class Bank {
    private String name;
    private Double money;

    public void transfer(Card sender, Card receiver, double amount) {
        sender.send(amount, 123);
        receiver.receive(amount, 123);
    }

    public Bank(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
