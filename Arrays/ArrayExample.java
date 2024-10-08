public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // numbers[0] = 1;  
        // numbers[1] = 2;  
        // numbers[2] = 3;  
        // numbers[3] = 4;  
        // numbers[4] = 5;  

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
