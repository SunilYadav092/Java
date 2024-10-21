abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("This animal is sleeping");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class abstract01 {
    public static void main(String[] args) {
     //   Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();  
        dog.sleep();  
        cat.sound();  
        cat.sleep();  
    }
}
