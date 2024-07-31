/*
 Inheritance-It is used to transfer or inherit data of parent(super,base) class into 
 child(sub,derived) class

 (Data reusabilty)
 Note:
1) In java to inherit class we use extends keyword.
2) In java to inherit interface we use implements keyword

Types of inheritance
1)Single-When a single base class inherit into single derived class is called single inheritance.
2)Multilevel-When we inherit data in chain is called multilevel inheritance.
3)Hierarchical-When single base class inherit into two or more classes.


(Data hiding)
Remaining two types will be used in abstraction using interface:
1)Multiple
2)Hybrid
 */
class Mobileshop{//base
    int price=25000;
    String name="Oneplus";//data member
    float processor=2.5F;
}
class Childclass extends Mobileshop{
    public void show()
    {
        System.out.println("Mobile Price: "+price+" Name: "+name+" processor "+processor);
    }
}
public class Inheritance {
   public static void main(String[] args) {
      Childclass c=new Childclass();
      c.show();
   }    
}
