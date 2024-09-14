package ru.vsu.cs.moroz.task1_8;
import java.util.ArrayList;

public class Order {
    public String customerName;                   // Имя заказчика
    public ArrayList<OrderItem> orderedItems;     // Список заказанных товаров
    public double totalAmount;                     // Итоговая сумма заказа

    // Конструктор
    public Order(String customerName) {
        this.customerName = customerName;
        this.orderedItems = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Метод для добавления продукта в заказ
    public void addProduct(Product product, int quantity) {
        if (quantity <= product.getCount()) {
            orderedItems.add(new OrderItem(product, quantity));
            totalAmount += product.getPrice() * quantity;
        } else {
            System.out.println("Недостаточное количество продукта: " + product.getName());
        }
    }

    // Метод для получения итоговой суммы заказа
    public double getTotalAmount() {
        return totalAmount;
    }

    // Метод для вывода информации о заказе
    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Заказ для: " + customerName + "\n");
        orderDetails.append("Заказанные продукты:\n");
        for (OrderItem item : orderedItems) {
            orderDetails.append(item.getProduct().getName())
                    .append(": ")
                    .append(item.getQuantity())
                    .append("\n");
        }
        orderDetails.append("Итоговая сумма: ").append(totalAmount).append(" руб.");
        return orderDetails.toString();
    }

        public static void main(String[] args) {
            // Создаем продукты
            Product product1 = new Product("Молоко", 150, 20, "11.09.24", "21.09.24");
            Product product2 = new Product("Хлеб", 80, 20, "11.09.24", "18.09.24");

            // Создаем заказ
            Order order1 = new Order("Иван Иванович");

            // Добавляем продукты в заказ
            order1.addProduct(product1, 3);
            order1.addProduct(product2, 2);

            // Выводим информацию о заказе в консоль
            System.out.println(order1);
        }
    }
