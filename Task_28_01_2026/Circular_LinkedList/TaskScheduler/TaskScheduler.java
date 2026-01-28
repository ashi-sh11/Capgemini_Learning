package Task_28_01_2026.Circular_LinkedList.TaskScheduler;

class TaskScheduler {
    TaskNode head = null, current = null;

    void addTask(int i,String n,int p,String d) {
        TaskNode t = new TaskNode(i,n,p,d);
        if (head == null) {
            head = t;
            t.next = t;
        } else {
            TaskNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void nextTask() {
        if (current == null) current = head;
        else current = current.next;
        System.out.println("Current Task: " + current.name);
    }

    void displayTasks() {
        if (head == null) return;
        TaskNode t = head;
        do {
            System.out.println(t.name);
            t = t.next;
        } while (t != head);
    }
}
