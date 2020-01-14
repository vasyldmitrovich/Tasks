package model;

public class Users {
    private int id;
    private String name;
    private String gender;
    private double balance;
    private double spend;

    public Users() {

    }

    public Users(String name, String gender, double balance, double spend, int id) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.balance = balance;
        this.spend = spend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public double getSpend() {
        return spend;
    }

    public void setSpend(double spend) {
        spend = spend;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Gender='" + gender + '\'' +
                ", Balance=" + balance +
                ", Spend=" + spend +
                '}';
    }

    public void ReduceBalance (double price) {
        this.balance -= price;
        this.spend += price;
    }//When buy product: Balance minus price and Spend plus


}
