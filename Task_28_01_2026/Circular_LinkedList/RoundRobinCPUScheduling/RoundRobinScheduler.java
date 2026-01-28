package Task_28_01_2026.Circular_LinkedList.RoundRobinCPUScheduling;

class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;   // circular link
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr.pid == pid) {
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid +
                    " | Burst: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }
    public void simulate(int timeQuantum) {
        if (head == null) return;

        ProcessNode current = head;
        int currentTime = 0;
        int totalProcesses = countProcesses();

        double totalWaitingTime = 0;
        double totalTurnaroundTime = 0;

        System.out.println("\n--- Round Robin Execution ---");

        while (head != null) {
            System.out.println("\nQueue Status:");
            displayQueue();

            if (current.burstTime > timeQuantum) {
                currentTime += timeQuantum;
                current.burstTime -= timeQuantum;
            } else {
                currentTime += current.burstTime;
                current.turnaroundTime = currentTime;
                current.waitingTime =
                        current.turnaroundTime -
                                (current.burstTime + current.waitingTime);

                totalWaitingTime += current.waitingTime;
                totalTurnaroundTime += current.turnaroundTime;

                int finishedPid = current.pid;
                current = current.next;
                removeProcess(finishedPid);
                continue;
            }

            current = current.next;
        }

        System.out.println("\n--- Scheduling Completed ---");
        System.out.println("Average Waiting Time = " +
                (totalWaitingTime / totalProcesses));
        System.out.println("Average Turnaround Time = " +
                (totalTurnaroundTime / totalProcesses));
    }

    private int countProcesses() {
        if (head == null) return 0;

        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}



