package hw.bank;

public class Account {
    private String username;
    private String password;
    private String fullname;
    private String phonenumber;
    private int age;

    public Account(String username, String password, String fullname, String phonenumber, int age) {
        this.age = age;
        this.fullname = fullname;
        this.password = password;
        this.phonenumber = phonenumber;
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}

