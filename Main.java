import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        while (true) {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Quantity: ");
                        int quantity = sc.nextInt();

                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        manager.addProduct(
                                new Product(id, name, quantity, price));

                        break;

                    case 2:
                        manager.viewProducts();
                        break;

                    case 3:

                        System.out.print("Enter Product ID: ");
                        int updateId = sc.nextInt();

                        System.out.print("New Quantity: ");
                        int newQuantity = sc.nextInt();

                        System.out.print("New Price: ");
                        double newPrice = sc.nextDouble();

                        manager.updateProduct(
                                updateId,
                                newQuantity,
                                newPrice);

                        break;

                    case 4:

                        System.out.print("Enter Product ID: ");
                        int deleteId = sc.nextInt();

                        manager.deleteProduct(deleteId);

                        break;

                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }
    }
}
