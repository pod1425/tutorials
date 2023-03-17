package hw.bank;

public class Account {

    String username;
    String password;
    String phoneNumber;
    String fullName;
    int age;

    Account(String username, String password, String phoneNumber, String fullName, int age) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.age = age;
    }

    public String toString() {
        return "Username: " + username + ", Password: " + password + ", Phone Number: " + phoneNumber + ", Full Name: " + fullName + ", Age: " + age;
    }

    public static void main(String[] args) {
        Account myAccount = new Account("myUsername", "myPassword", "099-123-45-67", "John Duk", 30);
        System.out.println(myAccount.toString());
    }
}
