class A{
void Show(){ 
    for (int i = 0; i < 10; i++) {
            System.out.println("Hi Everyone");
        }
    }
}
class B{
void Show(){
        for (int i = 0; i < 10; i++) { 
            System.out.println("Good Morning!");
        }
    }
}
public class ThreadDemo{
public static void main(String[] args) {
    A Obj1 = new A();
    B Obj2= new B();
    Obj1.Show();
    Obj2.Show();
    }
}

