package Task_28_01_2026.Circular_LinkedList.TaskScheduler;

class TaskNode {
    int id, priority;
    String name, dueDate;
    TaskNode next;

    TaskNode(int i, String n, int p, String d) {
        id=i; name=n; priority=p; dueDate=d;
    }
}
