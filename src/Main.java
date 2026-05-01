public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Rice Seeds", 50, 2500);

        p1.display();

        p1.sellStock(35);

        System.out.println("\nAfter Selling:");
        p1.display();

        p1.checkLowStock();
    }
}