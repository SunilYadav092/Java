class Parent {
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}
class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("Message from Child class");
    }
}

public class SimpleOverrideExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMessage();  // Calls Parent's method
        Child c = new Child();
        c.showMessage();  // Calls Child's overridden method
    }
}
