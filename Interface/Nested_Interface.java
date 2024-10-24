class Computer {
    interface USB {
        void connect();
    }
}
class Keyboard implements Computer.USB {
    public void connect() {
        System.out.println("Keyboard connected via USB.");
    }
}
class Mouse implements Computer.USB {
    public void connect() {
        System.out.println("Mouse connected via USB.");
    }
}
public class Nested_Interface {
    public static void main(String[] args) {
        Computer.USB keyboard = new Keyboard();
        keyboard.connect();
        
        Computer.USB mouse = new Mouse();
        mouse.connect();
    }
}
