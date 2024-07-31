/*
 Encapsulation:It is used to wrap or bind multiple data into single unit by hiding internal sensitive data
 using private access modifier.But we know that private data member cannot access outside a class.

 We have to use two methods to set and get information of given private data set:
 1)setter-It is used to set values for private data members(In this we use method with parameter and no return value).
 2)getter-It is used to retrieve given information (In this we use method with return value and no parameter)
 */
class Login{//class
    private String username;
    private int pin;//private data member

      //setter
      void setdata(String x,int y)
      {
        username=x;
        pin=y;
      }

      //getter
       String get1()
       {
        return username;
       }

       //getter
       int get2()
       {
        return pin;
       }

}
public class Encapsulation {
  public static void main(String[] args) {
       Login l=new Login();//object
       l.setdata("Saksham", 8520);//calling setter
       System.out.println("Username: "+l.get1()+" Pin : "+l.get2());//calling getter
  }     
}
