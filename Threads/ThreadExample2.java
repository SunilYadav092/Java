class A implements Runnable {
    public synchronized  void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hi Everyone");
               // Thread.sleep(10);
                }
    }
}
class B implements  Runnable {
    public synchronized  void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Good Morning!!");
                
            }
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        
        A Obj1 = new A();
        B Obj2 = new B();

        Thread t1 = new Thread(Obj1);
        Thread t2 = new Thread(Obj2);

        t1.start();
        t2.start();
    }
}

