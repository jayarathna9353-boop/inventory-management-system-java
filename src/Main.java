public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Rice Seeds", 50, 2500);

        System.out.println("Before Update");
        p1.display();

        p1.addStock(20);

        System.out.println("\nAfter Adding Stock");
        p1.display();

        p1.sellStock(10);

        System.out.println("\nAfter Selling Stock");
        p1.display();
    }
}