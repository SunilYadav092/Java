abstract class Animal {
    //int age=30;
    abstract void sound();
    void sleep() {
        System.out.println("This animal is sleeping");
    } }
class Dog extends Animal {
   // abstract void run();
    void sound() {
        System.out.println("Dog barks");
    } }
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    } }
public class abstract01 {
    public static void main(String[] args) {
     //   Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();  
        dog.sleep();  
        cat.sound();  
        cat.sleep();  
    //System.out.println(cat.age);
    }
}
