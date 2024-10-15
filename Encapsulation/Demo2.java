class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anil");
        student.setAge(30);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
