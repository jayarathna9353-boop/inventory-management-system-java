import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("Rice Seeds", 50, 2500);
        Product p2 = new Product("Fertilizer", 30, 1800);
        Product p3 = new Product("Wheat Seeds", 40, 2000);

        int choice, productChoice;

        do {
            System.out.println("\nFarmer Inventory Management System");
            System.out.println("1. View Products");
            System.out.println("2. Add Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                p1.display();
                p2.display();
                p3.display();
            }

            else if(choice == 2 || choice == 3) {
                System.out.println("Select Product:");
                System.out.println("1. Rice Seeds");
                System.out.println("2. Fertilizer");
                System.out.println("3. Wheat Seeds");

                productChoice = sc.nextInt();

                Product selected = null;

                if(productChoice == 1) selected = p1;
                else if(productChoice == 2) selected = p2;
                else if(productChoice == 3) selected = p3;

                if(selected != null) {
                    if(choice == 2)
                        selected.addStock(10);
                    else
                        selected.sellStock(5);

                    selected.display();
                }
            }

        } while(choice != 4);

        sc.close();
    }
}