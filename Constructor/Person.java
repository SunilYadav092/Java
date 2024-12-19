class Person {
    String name;
    int age;
    String gender;

    // Constructor 1: No parameters
    public Person() {
        name = "Unknown";
        age = 0;
        gender = "Not specified";
    }

    // Constructor 2: One parameter (name)
    public Person(String n) {
        name = n;
        age = 0;
        gender = "Not specified";
    }

    // Constructor 3: Two parameters (name, age)
    public Person(String n, int a) {
        name = n;
        age = a;
        gender = "Not specified";
    }

    // Constructor 4: Three parameters (name, age, gender)
    public Person(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
    public static void main(String[] args) {
        // Using different constructors
        Person person1 = new Person(); // No parameters
        Person person2 = new Person("Alice"); // One parameter
        Person person3 = new Person("Bob", 25); // Two parameters
        Person person4 = new Person("Charlie", 30, "Male"); // Three parameters

        // Displaying person information
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
    }
}
