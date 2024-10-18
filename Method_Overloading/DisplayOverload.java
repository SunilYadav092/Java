class DisplayOverload {

    void display(int num) {
        System.out.println("Displaying integer: " + num);
    }

    void display(double num) {
        System.out.println("Displaying double: " + num);
    }

    void display(String str) {
        System.out.println("Displaying string: " + str);
    }

    void display(int num, String str) {
        System.out.println("Displaying integer and string: " + num + ", " + str);
    }

    public static void main(String[] args) {
        DisplayOverload obj = new DisplayOverload();
        obj.display(100);               
        obj.display(99.99);             
        obj.display("Hello, World!");   
        obj.display(200, "Java");       
    }
}
