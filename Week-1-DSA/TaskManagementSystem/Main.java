public class Main {

    public static void main(String[] args) {

        TaskManagementSystem tasks = new TaskManagementSystem();

        tasks.addTask(1, "Design UI", "Pending");
        tasks.addTask(2, "Write Code", "In Progress");
        tasks.addTask(3, "Testing", "Pending");

        System.out.println("All Tasks:");
        tasks.displayTasks();

        System.out.println("\nSearching Task 2:");
        Task task = tasks.searchTask(2);

        if (task != null)
            task.display();

        System.out.println("\nDeleting Task 2");
        tasks.deleteTask(2);

        System.out.println("\nTasks After Deletion:");
        tasks.displayTasks();
    }
}