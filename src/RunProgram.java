import controller.ProductController;
import controller.UsersController;
import model.Product;
import model.Users;
import utils.CreateObject;
import view.UsersShow;

import java.util.Scanner;

public class RunProgram {
    
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.listProduct();
        UsersController usersController = new UsersController();
        usersController.showUser();
        while (true) {
            usersController.firstMessage();
            productController.showProduct();
            int productNumber = inputNumber();
            usersController.replaceBalanceToSpend(productNumber);
        }
    }

    public static int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}
