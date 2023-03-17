package Lesson_incapsulation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email, login and password to create account");
        String email = scanner.nextLine();
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        Account acc = new Account(login, password, email);
        System.out.println("Enter login/email and password to log in");
        login = scanner.nextLine();
        password = scanner.nextLine();

        if (login.equals(acc.getLogin()) && acc.passwordsMatch(password)) {
            System.out.println("Successfully logged in!");
        } else {
            System.out.println("Failed to log in!");
        }


        //System.out.println("You account is: " + acc);
    }
}
