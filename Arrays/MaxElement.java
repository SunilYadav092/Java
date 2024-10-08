public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
