public class MethodWithParameters {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum is: " + sum);
    }
}
