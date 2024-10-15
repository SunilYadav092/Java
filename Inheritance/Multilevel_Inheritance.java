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
class Puppy extends Dog {
    public void weep() {
        System.out.println("The puppy weeps.");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.weep();  // Method from Puppy
    }
}
