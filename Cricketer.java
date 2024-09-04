class Cricketer{
     String name = "Virat";
     int age = 35;
     String color = "Brown";
     String role = "Batsman";
     String nationality= "Indian";  

     void cricketerDetails(){
         System.out.println(name + " " + age);
         System.out.println(age);
         System.out.println(color);
         System.out.println(role);
         System.out.println(nationality); 
}//end of criketerDetails method 
public static void main(String args[])
  {
    System.out.println("main method started");
       Cricketer c = new Cricketer();
       c.cricketerDetails();
       System.out.println("main method ended");
    }//end of main method
}//end of Cricketer class
