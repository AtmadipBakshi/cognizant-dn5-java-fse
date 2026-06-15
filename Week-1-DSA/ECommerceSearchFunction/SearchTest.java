public class SearchTest {

    
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Mouse", "Accessories"),
                new Product(105, "Monitor", "Electronics")
        };

        Product linearResult = linearSearch(products, 104);

        if (linearResult != null) {
            System.out.println("Linear Search Found: " + linearResult.productName);
        } else {
            System.out.println("Product not found using Linear Search");
        }

        Product binaryResult = binarySearch(products, 104);

        if (binaryResult != null) {
            System.out.println("Binary Search Found: " + binaryResult.productName);
        } else {
            System.out.println("Product not found using Binary Search");
        }
    }
}