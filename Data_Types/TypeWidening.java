public class TypeWidening {
    public static void main(String[] args) {
        byte b = 50;
        short s = b;  // Byte to short
        int i = s;  // Short to int
        long l = i;  // Int to long
        float f = l;  // Long to float
        double d = f;  // Float to double
        System.out.println("Final double value: " + d);
    }
}
