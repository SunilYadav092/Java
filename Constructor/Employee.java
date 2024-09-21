class Employee {
    String name;
    int age;

    // Constructor with parameters
    public Employee(String name, int age) {
        // Using 'this' to refer to the current object's instance variables
        this.name = name; 
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 28);
        emp1.displayInfo();
    }
}
