class Subclass {
    void operator(String str1, String str2) {
        String s = str1 + str2;  
        System.out.println("Concatenated String - " + s);
    }

    void operator(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }
}
public class Operator_Overloading {
    public static void main(String[] args) {
        Subclass obj = new Subclass(); 

        // Calling the overloaded methods
        obj.operator(20, 30);           
        obj.operator("Code", "Mithra"); 
    }
}
