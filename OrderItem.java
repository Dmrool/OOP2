package ru.vsu.cs.moroz.task1_8;

public class OrderItem {
    private Product product; // Продукт
    private int quantity;    // Количество

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

