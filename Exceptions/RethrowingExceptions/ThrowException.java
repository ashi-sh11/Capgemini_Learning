package Task_05_02_2026.Exceptions.RethrowingExceptions;


public class ThrowException{

    public static int performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }

    public static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            // Rethrow with additional context
            throw new ArithmeticException(
                    "Error occurred while calculating division: " + e.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        try {
            int result = calculate(10, 1);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Calculation failed!");
            System.out.println(e.getMessage());
        }
    }
}
