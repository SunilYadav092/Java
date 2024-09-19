class Person {
    String name;
    int age;

    void displayDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void modifyDetails(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.modifyDetails("John", 25);
        person.displayDetails(person.name, person.age);
    }
}
