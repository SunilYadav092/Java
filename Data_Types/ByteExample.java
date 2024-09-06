public class ByteExample {
    public static void main(String[] args) {
        byte smallNumber = 120;
        byte anotherNumber = 10;
        byte sum = (byte) (smallNumber + anotherNumber); // Casting as byte
        System.out.println("Byte Sum: " + sum); // To fit into a byte, Java applies a wrap-around effect
    }
}
