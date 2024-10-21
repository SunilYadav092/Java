class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    } }
class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card payment");
    } }
class PayPalPayment extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment");
    } }
class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("Processing UPI payment");
    } }
public class Poly01 {
    public static void main(String[] args) {
        Payment payment;
        // Dynamic method dispatch
        payment = new CreditCardPayment();
        payment.processPayment();  
        payment = new PayPalPayment();
        payment.processPayment(); 
        payment = new UPIPayment();
        payment.processPayment();  
    }
}
