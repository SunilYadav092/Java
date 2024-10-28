public class Exception_Demo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); 

        } catch (ArrayIndexOutOfBoundsException e) {
         
            System.out.println("Error: Index out of bounds!");
        }
        finally{
        System.out.println("Program continues...");
        }
    }
}
