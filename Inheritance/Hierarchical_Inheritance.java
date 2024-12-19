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
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();   // Inherited from Animal
        dog.bark();  // Method from Dog
        cat.eat();   // Inherited from Animal
        cat.meow();  // Method from Cat
    }
}
