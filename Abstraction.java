/*
 Abstraction-It is mechanism to hide internal functionality of given class using abstract 
 class and interface.

 1)abstract class-It is declared by using abstract keyword .Every absttract class have atleast 
 one abstract method.  In abstract class we only declare and define its functionality 
 into another class. To inherit abstract class use extends keyword.

 2)interface-It is same like abstract class but we use interface keyword instead of abstract 
 keyword.To inherit interface we use implements keyword.

 Note:After extending implements its propertis using method overriding inside another class
 */
abstract class Personaldetail{
   abstract void chatlock(); //abstract class
}
class Useraccount extends Personaldetail{

    @Override
    void chatlock() {
        System.out.println("Chat lock is on");
    }//single

    

}

public class Abstraction {
   public static void main(String[] args) {
           Useraccount ac=new Useraccount();
           ac.chatlock();   
  }    
}
