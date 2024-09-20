public class ArithmeticOperations {
    
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition of " + num1 + " and " + num2 + ": " + add(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + ": " + subtract(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + multiply(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + ": " + divide(num1, num2));
        System.out.println("Modulus of " + num1 + " and " + num2 + ": " + modulus(num1, num2));
    }
}