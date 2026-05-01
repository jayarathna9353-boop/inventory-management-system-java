public class Product {
    String name;
    int quantity;
    int price;

    Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void addStock(int amount) {
        quantity += amount;
    }

    void sellStock(int amount) {
        quantity -= amount;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}