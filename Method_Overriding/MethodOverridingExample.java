class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();  
        Cat cat = new Cat();  

        animal.sound();  // Calls the method from Animal class
        dog.sound();     // Calls the overridden method from Dog class
        cat.sound();     // Calls the overridden method from Cat class
    }
}
