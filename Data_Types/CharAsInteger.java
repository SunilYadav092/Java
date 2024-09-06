public class CharAsInteger {
    public static void main(String[] args) {
        char ch = 'H';
        int asciiValue = ch;  // Implicit promotion to int (ASCII value of 'H')
        int shiftedValue = asciiValue + 5;
        System.out.println("Original ASCII: " + asciiValue);
        System.out.println("Shifted ASCII: " + shiftedValue);
    }
}
