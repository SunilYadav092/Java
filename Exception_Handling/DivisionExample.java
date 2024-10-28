public class DivisionExample {
    static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(10, 0));  // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
