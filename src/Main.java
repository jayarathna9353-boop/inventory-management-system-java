import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product("Rice Seeds", 50, 2500);

        int choice;

        do {
            System.out.println("\nFarmer Inventory Management System");
            System.out.println("1. View Product");
            System.out.println("2. Add Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                p1.display();
            }
            else if(choice == 2) {
                p1.addStock(20);
                p1.display();
            }
            else if(choice == 3) {
                p1.sellStock(10);
                p1.display();
            }

        } while(choice != 4);

        sc.close();
    }
}