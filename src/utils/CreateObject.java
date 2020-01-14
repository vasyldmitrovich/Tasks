package utils;
import model.Product;
import model.Users;

public class CreateObject {
    /*In other situation method in this class could get data about product from data base.
    *Imagine this class how database*/
    private static int id = 1;
    private static String name = "Bob";
    private static String gender = "Man";
    private static double balance = 25000;
    private static double spend = 0;

    public static Product [] getProducts() {
        Product [] products = {
                new Product(1,1000,"Sony",2004),
                new Product(2,770,"Microsoft",2007),
                new Product(3,2900,"Apple",2011),
                new Product(4,7000,"Samsung",2019)
        };
        return products;
    }

    public static Users getUsers () {
        Users users = new Users(name, gender, balance, spend, id);
        return users;
    }

    public void setUsers(Users users) {
        this.id = users.getId();
        this.name = users.getName();
        this.gender = users.getGender();
        this.balance = users.getBalance();
        this.spend = users.getSpend();
    }
}
