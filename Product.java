package ru.vsu.cs.moroz.task1_8;


import java.util.ArrayList;

public class Product {
    private String name;          // Название продукта
    private double price;         // Цена продукта
    private int count;            // Количество продукта
    private String manufactureDate; // Дата изготовления
    private String expirationDate;  // Дата окончания срока годности

    // Конструктор
    public Product(String name, double price, int count, String manufactureDate, String expirationDate) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }

    // Геттеры и сеттеры
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


    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public static ArrayList<Product> getProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Молоко", 150, 20, "11.09.24", "21.09.24"));
        productList.add(new Product("Хлеб", 80, 20, "11.09.24", "18.09.24"));
        productList.add(new Product("Колбаса", 220, 20, "11.09.24", "21.11.24"));
        productList.add(new Product("Вода", 60, 20, "11.09.24", "21.09.25"));
        productList.add(new Product("Конфеты", 150, 20, "11.09.24", "21.09.26"));
        return productList;
    }


    @Override
    public String toString() {
        return "{" + name + '\'' +
                ", Цена=" + price +
                ", Количество=" + count +
                ", Дата изготовления='" + manufactureDate + '\'' +
                ", Дата окончания срока годности='" + expirationDate + '\'' +
                '}';
    }
    public static void main(String[] args) {
        ArrayList<Product> products = Product.getProductList();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

