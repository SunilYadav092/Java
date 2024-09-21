class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Student name: " + name);
    }
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.displayInfo(); 
    }
}
