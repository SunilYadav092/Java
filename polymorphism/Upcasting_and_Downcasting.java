class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
    void drive() {
        System.out.println("Car is driving");
    }
}
public class Upcasting_and_Downcasting {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();  
        vehicle.start();  
        Car car = (Car) vehicle;
        car.start();  
        car.drive();  
    
    }
}
