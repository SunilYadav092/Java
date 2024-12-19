class OverloadWithReturnType {
    int calculate(int a) {
        return a * a;
    }
    double calculate(double a) {
        return a * a;
    }
    int calculate(int a, int b) {
        return a + b;
    }
    double calculate(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        OverloadWithReturnType obj = new OverloadWithReturnType();
        System.out.println("Square of integer 5: " + obj.calculate(5));          // Returns an int
        System.out.println("Square of double 5.5: " + obj.calculate(5.5));       // Returns a double
        System.out.println("Sum of integers 3 and 7: " + obj.calculate(3, 7));   // Returns an int
        System.out.println("Sum of doubles 3.2 and 7.8: " + obj.calculate(3.2, 7.8)); // Returns a double
    }
}
