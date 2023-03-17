package Lesson_incapsulation;

public class Account {
    private String login;
    private String password;
    private String email;
    private boolean active;

    public Account(String login, String password, String email) {
        setEmail(email);
        this.password = password;
        setLogin(login);
        this.active = true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login.length() > 4) {
            this.login = login;
        } else {
            System.out.println("Error! Login cant be less than 4 symbols");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() > 4) {
            this.email = email;
        } else {
            System.out.println("Error! Email cant be less than 4 symbols");
        }
    }

    public boolean passwordsMatch(String password) {
        return this.password.equals(password);
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public String toString() {
        return "Account: " + this.login + " " + this.email;
    }
}
