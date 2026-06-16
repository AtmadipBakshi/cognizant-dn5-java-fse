public class TaskManagementSystem {

    private Task head;

    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    public Task searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }

    public void displayTasks() {
        Task temp = head;

        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }

    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != id) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }
}