class A extends Thread {
    public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi Everyone");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
                }
    } }
class B extends Thread {
    public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Good Morning!!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
            }
    } } 
public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException { 
        A Obj1 = new A();

        System.out.println(Obj1.getPriority());
        
        Obj1.setPriority(Thread.MAX_PRIORITY);
        
        B Obj2 = new B();

        Obj1.start();
        try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                }
        Obj2.start();

        
    }
}

