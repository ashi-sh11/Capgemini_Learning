package Task_09_03_2026;

public class OperationChoices {
    public static void main(String[] args) {
        int c = 1;
        int a = 12;
        int b = 16;
        System.out.println(operationChoices(c, a, b));
    }
    static int operationChoices(int c, int a, int b) {
        switch (c) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }
}