public class SortOrders {

    public static void bubbleSort(Order[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].totalPrice > arr[j + 1].totalPrice) {

                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice <= pivot) {
                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printOrders(Order[] arr) {
        for (Order o : arr) {
            o.display();
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Amit", 2500),
            new Order(102, "Ravi", 1200),
            new Order(103, "Neha", 5000),
            new Order(104, "Sara", 3000),
            new Order(105, "Karan", 1800)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

       
        Order[] bubbleArr = orders.clone();
        bubbleSort(bubbleArr);

        System.out.println("\nAfter Bubble Sort:");
        printOrders(bubbleArr);

       
        Order[] quickArr = orders.clone();
        quickSort(quickArr, 0, quickArr.length - 1);

        System.out.println("\nAfter Quick Sort:");
        printOrders(quickArr);
    }
}