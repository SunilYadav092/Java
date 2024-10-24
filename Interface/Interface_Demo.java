interface Animal {
    void sound(); 
    void sleep(); 
}
class Dog implements Animal {
    public void sound() {
        System.out.println("The dog barks");
    }
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("The cat meows");
    }
    public void sleep() {
        System.out.println("The cat is sleeping");
    }
}
public class Interface_Demo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        myDog.sound();            
        myDog.sleep();            

        Animal myCat = new Cat(); 
        myCat.sound();            
        myCat.sleep();            
    }
}
