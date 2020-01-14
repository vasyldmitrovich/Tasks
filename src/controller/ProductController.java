package controller;
import model.Product;
import utils.CreateObject;
import view.ProductShow;

public class ProductController {

    public void listProduct () {
        Product [] products = CreateObject.getProducts();
        ProductShow productShow = new ProductShow();
        productShow.listAllProduct(products);
    }

    public void showProduct () {
        Product [] products = CreateObject.getProducts();
        ProductShow productShow = new ProductShow();
        productShow.showProduct(products);
    }
}
