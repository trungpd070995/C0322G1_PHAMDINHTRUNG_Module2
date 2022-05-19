package _12_java_collection_framework.exercise.practice_using_array_arraylist;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price, int quantity) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getIdProduct() + " " + getNameProduct() + " " + getPrice() + " " + getQuantity();
    }
}
