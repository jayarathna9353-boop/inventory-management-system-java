public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Rice Seeds", 50, 2500);
        Product p2 = new Product("Fertilizer", 20, 1800);
        Product p3 = new Product("Wheat Seeds", 30, 2000);

        System.out.println("Farmer Inventory Management System");

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}