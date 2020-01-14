package view;
import model.Product;

public class ProductShow {

    public void listAllProduct (Product[] products) {
        for (Product p: products
             ) {
            if (p == null) {
                continue;
            }
            System.out.println(p);
        }
    }

    public void showProduct (Product [] products) {
        for (int i = 0; i < products.length;i++) {
            System.out.println("If you want product: "+i+" "+products[i].getManufacturer()+
                    " For the price: "+products[i].getPrice()+" Input number: "+i);
        }
    }
}
