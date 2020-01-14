package model;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private int price;
    private String manufacturer;
    private int year;

    public Product() {

    }

    public Product(int id, int price, String manufacturer, int year) {
        this.id = id;
        this.price = price;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                price == product.price &&
                year == product.year &&
                Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, manufacturer, year);
    }

    @Override
    public int compareTo(Product product) {
        return Integer.compare(getPrice(), product.getPrice());
    }
}
