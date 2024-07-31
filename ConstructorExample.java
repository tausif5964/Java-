/*
 Constructor-It is an instance of class which call automatically whenever we create
 object of class using new keyword.

 Types of constructor
 1)Default-In this we don't use parameter
 2)Parameterized-In this we use parameter.

 Note :Classname and constructor name will be same.
 */
class Ticket{
   Ticket()//default
   {
      System.out.println("IND VS PAK");
   }
}

class MovieTicket{//parameterized
    MovieTicket(String name)
    {
         System.out.println("Movie name: "+name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
      Ticket t=new Ticket();
      Ticket t2=new Ticket();  
      
        MovieTicket m1=new MovieTicket("Jawan");
        MovieTicket m2=new MovieTicket("Gadar 2");
        MovieTicket m3=new MovieTicket("LEO");
              
    }
    
}
