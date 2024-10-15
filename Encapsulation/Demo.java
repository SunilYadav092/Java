class Student {
   int age;
   String name;
}

public class Demo {
    public static void main(String args[]) {
        Student obj = new Student();        
        obj.age = 30;
        obj.name = "Anil";
        System.out.println(obj.name + " : " + obj.age);
    }
}
