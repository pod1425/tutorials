package hw.bank;

public class Bank {

    String name;
    double money;

    Bank(String name, double money){
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return "Name: " + name + ", Money: " + money;
    }

    public static void main(String[] args){
        Bank myAccount = new Bank("John Duk", 100.0);
        System.out.println(myAccount.toString());
    }
}
