public class IntegerOverflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int result = maxInt + 1; // This causes an integer overflow
        System.out.println("Max int value: " + maxInt);
        System.out.println("Overflowed result: " + result); // Results in the minimum integer value
    }
}
