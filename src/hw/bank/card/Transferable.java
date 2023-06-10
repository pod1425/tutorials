package hw.bank.card;

public interface Transferable {
    void send(double amount);

    void receive(double amount);

    void receive(double amount, int key);

    void send(double amount, int key);
}
