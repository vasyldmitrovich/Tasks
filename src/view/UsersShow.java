package view;

import model.Product;
import model.Users;
import utils.CreateObject;

public class UsersShow {

    public void showUser(Users user) {
        System.out.println(user);
    }

    public void firstMessage (Users user) {
        System.out.println("\t \t \t \t Hello: "+user.getName()+"\t Your balance is: "+user.getBalance()+
                "\t You spend: "+user.getSpend());
    }

    public void replaceBalanceToSpend (Users user, Product [] products, int productNumber) {
        if (productNumber >=0 && productNumber < products.length) {
            if (products[productNumber].getPrice() < user.getBalance()) {
                double temp = products[productNumber].getPrice();
                user.ReduceBalance(temp);
                System.out.println(user.getName()+" is buy  "+products[productNumber].getManufacturer()+
                        " by "+products[productNumber].getPrice()+". Your product was sent to the warehouse");
            }
            else {
                System.out.println("You do not have enought money");
            }
        }
        else {
            System.out.println("This product do not exist");
        }
        CreateObject createObject = new CreateObject();
        createObject.setUsers(user);
    }
}
