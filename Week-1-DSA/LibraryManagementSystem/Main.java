public class Main {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Galvin"),
                new Book(104, "Computer Networks", "Tanenbaum"),
                new Book(105, "Database Systems", "Korth")
        };

        System.out.println("Linear Search:");

        Book result1 =
                LibraryManagementSystem.linearSearch(
                        books,
                        "Operating Systems"
                );

        if (result1 != null)
            result1.display();

        LibraryManagementSystem.sortBooks(books);

        System.out.println("\nBinary Search:");

        Book result2 =
                LibraryManagementSystem.binarySearch(
                        books,
                        "Operating Systems"
                );

        if (result2 != null)
            result2.display();
    }
}