class Student {
    private String name ="Anil";
    private int age = 30;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Demo1 {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
