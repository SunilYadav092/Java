class A implements Runnable {
    public void run() {
        synchronized (ThreadExample4.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi Everyone");
                ThreadExample4.class.notify(); // Notify the other thread
                try {
                    ThreadExample4.class.wait(); // Wait for the other thread to complete its turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            ThreadExample4.class.notify(); // Final notify to release waiting thread
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        synchronized (ThreadExample4.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good Morning!!");
                ThreadExample4.class.notify(); // Notify the other thread
                try {
                    ThreadExample4.class.wait(); // Wait for the other thread to complete its turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            ThreadExample4.class.notify(); // Final notify to release waiting thread
        }
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.start();
        t2.start();
    }
}
