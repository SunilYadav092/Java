class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.bark();  // Method from Dog
    }
}
