public class ToDoList {
    
    public static void manageToDoList() {
        String[] toDoList = {"Buy Groceries", "Read a Book", "Attend Java Workshop", "Complete Assignment", "Prepare Presentation"};
        System.out.println("To-Do List:");
        for (int i = 0; i < toDoList.length; i++) {
            System.out.println((i + 1) + ". " + toDoList[i]);
        }
    }

    public static void main(String[] args) {
        manageToDoList();
    }
}
