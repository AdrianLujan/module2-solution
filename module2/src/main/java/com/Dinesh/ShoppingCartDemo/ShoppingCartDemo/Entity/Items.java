package com.Dinesh.ShoppingCartDemo.ShoppingCartDemo.Entity;

public class Items {

    private String name;

    private int price;

    private int stock;

    public Items(){

    }

    public Items(String name, int i, int stock) {
        this.name = name;
        this.price = i;
        this.stock = stock;
    }

    // And also we need to add stock manally.
    public void add_stock(int add){
        this.stock+=add;
    }

    public void reduce_stock(int add){
        this.stock-=add;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
