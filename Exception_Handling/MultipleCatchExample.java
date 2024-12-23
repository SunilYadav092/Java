public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
            int result = 10 / 0; 
            System.out.println(result); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! " + e.getMessage());
  
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }
        System.out.println("Program continues after the exception handling.");
    }
}
