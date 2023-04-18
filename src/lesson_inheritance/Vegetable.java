package lesson_inheritance;

public class Vegetable extends Product {
    String dateOfExpire;

    public Vegetable(String name, double price, String dateOfExpire) {
        super(name, price);
        this.dateOfExpire = dateOfExpire;
    }

    public String getDateOfExpire() {
        return dateOfExpire;
    }

    public void setDateOfExpire(String dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", date of expire: " + this.dateOfExpire;
    }
}
