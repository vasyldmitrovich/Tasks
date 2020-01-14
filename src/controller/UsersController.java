package controller;
import model.Product;
import model.Users;
import utils.CreateObject;
import view.UsersShow;

public class UsersController {

    public void showUser() {
        Users user = CreateObject.getUsers();
        UsersShow usersShow = new UsersShow();
        usersShow.showUser(user);
    }

    public void replaceBalanceToSpend (int productNumber) {
        Users user = CreateObject.getUsers();
        Product[] products = CreateObject.getProducts();
        UsersShow usersShow = new UsersShow();
        usersShow.replaceBalanceToSpend(user,products,productNumber);
        CreateObject createObject = new CreateObject();
        createObject.setUsers(user);
    }

    public void firstMessage() {
        Users user = CreateObject.getUsers();
        UsersShow usersShow = new UsersShow();
        usersShow.firstMessage(user);
    }
}
