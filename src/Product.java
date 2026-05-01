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
    if(amount > quantity) {
        System.out.println("Not enough stock available");
    } else {
        quantity -= amount;

        if(quantity < 20) {
            System.out.println("Low Stock Alert for " + name);
        }
    }
}

    void checkLowStock() {
        if(quantity < 20) {
            System.out.println("Low Stock Alert for " + name);
        }
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}