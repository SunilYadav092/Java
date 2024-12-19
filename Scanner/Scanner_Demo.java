import java.util.Scanner;
class Scanner_Demo{
    public static void main(String[] args) {
        System.out.println("Hi Hello");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 
        
        System.out.print("Enter your Course: ");
        String Course = sc.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your Learning : " + Course);

        sc.close();
    }
}