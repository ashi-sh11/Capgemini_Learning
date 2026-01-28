package Task_28_01_2026.Circular_LinkedList.RoundRobinCPUScheduling;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        int timeQuantum = 3;
        rr.simulate(timeQuantum);
    }
}
