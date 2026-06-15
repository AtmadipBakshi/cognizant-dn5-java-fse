import java.util.HashMap;

public class InventoryManager {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    
    public static void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product added: " + p.productName);
    }

    
    public static void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated: " + p.productName);
        } else {
            System.out.println("Product not found");
        }
    }
    public static void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted: " + id);
        } else {
            System.out.println("Product not found");
        }
    }
    public static void displayInventory() {
        System.out.println("\n--- INVENTORY ---");
        for (Product p : inventory.values()) {
            p.display();
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 10, 55000));
        addProduct(new Product(102, "Mouse", 50, 500));
        addProduct(new Product(103, "Keyboard", 30, 1200));

        displayInventory();

        updateProduct(102, 100, 450);
        deleteProduct(103);

        displayInventory();
    }
}