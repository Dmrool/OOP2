package ru.vsu.cs.moroz.task1_8;

import java.util.ArrayList;

public class Delivery extends Order {

    private ArrayList<Order> orderList;              // Список заказов
    private String address;                            // Адрес доставки

    // Конструктор
    public Delivery(String customer, String address) {
        super(customer);
        this.address = address;
        this.orderList = new ArrayList<>();
    }

    // Метод для добавления заказа в доставку
    public void addOrder(Order order) {
        orderList.add(order);
        totalAmount += order.getTotalAmount();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getDeliveryDetails() {
        ArrayList<String> details = new ArrayList<>();
        details.add("Адрес: " + address);

        for (Order order : orderList) {
            details.add(order.toString());
        }

        return details;
    }

    public static void main(String[] args) {
        // Создаем продукты
        Product product1 = new Product("Молоко", 150, 20, "11.09.24", "21.09.24");
        Product product2 = new Product("Хлеб", 80, 20, "11.09.24", "18.09.24");

        // Создаем заказ
        Order order1 = new Order("Иван Иванович");
        order1.addProduct(product1, 3);
        order1.addProduct(product2, 2);

        // Создаем доставку
        Delivery delivery = new Delivery(order1.customerName, "Улица Пушкина, дом 10");

        // Добавляем заказ в доставку
        delivery.addOrder(order1);

        // Выводим информацию о доставке
        ArrayList<String> deliveryDetails = delivery.getDeliveryDetails();
        for (String detail : deliveryDetails) {
            System.out.println(detail);
        }
    }
}
