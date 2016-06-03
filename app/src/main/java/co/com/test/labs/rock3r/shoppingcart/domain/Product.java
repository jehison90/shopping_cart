package co.com.test.labs.rock3r.shoppingcart.domain;

import android.graphics.drawable.Drawable;

/**
 * Created by Jehison on 07/04/2016.
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private int productsInStock;
    private Drawable image;

    public Product(int id, String name, double price, int productsInStock, Drawable image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productsInStock = productsInStock;
        this.image = image;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductsInStock() {
        return productsInStock;
    }

    public void setProductsInStock(int productsInStock) {
        this.productsInStock = productsInStock;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
