
/*
 OOPS(object oriented programming)-It is used to store different collection of elements using
 class and object .

 1)class-It is a prototype blueprint of given data which is used for object construction.
 class is declared by using class keyword.

 2)object-It is used to show information of given class .Always create object inside a main()

 3)Encapsulation-It is used to wrapr or bind multiple data by  hiding internal sensitive data 
                 using private access modifier(data binding)

 4)Inheritance-It is used to access parent class data into child class.So it provide
    (data reusability.)

5)Polymorphism-It is used to perform more than a single task from given class or method
               (dynamic binding)

6)Abstraction-It is used to hide functionality of class(Hiding process).
 */
class IceCreamShop{//classname
    String Flavour;
    float price;//data member

}
public class OOps {
    public static void main(String[] args) {
          IceCreamShop i1=new IceCreamShop();
          IceCreamShop i2=new IceCreamShop();
          
          i1.Flavour="Choclate";//accessing data using object
          i1.price=26.50F;

          i2.Flavour="Butterscotch";
          i2.price=50.45F;

          //output using objects
          System.out.println("The Flavour is "+i1.Flavour+" Price is "+i1.price);
          
          System.out.println("The Flavour is "+i2.Flavour+" Price is "+i2.price);
    }
}
