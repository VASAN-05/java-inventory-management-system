import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product Added Successfully");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory Empty");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void updateProduct(int id, int quantity, double price) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setQuantity(quantity);
                p.setPrice(price);
                System.out.println("Product Updated");
                return;
            }
        }

        System.out.println("Product Not Found");
    }

    public void deleteProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                System.out.println("Product Deleted");
                return;
            }
        }

        System.out.println("Product Not Found");
    }
}
