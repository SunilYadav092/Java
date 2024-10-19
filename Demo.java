import other.Test1;

class Test4 extends Test1{
    public void print(){
        System.out.println(this.value);
    }
}
public class Demo {
    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        System.out.println(obj1.value);

        Test2 obj2 = new Test2();
        System.out.println(obj2.value);
        
    }
}
