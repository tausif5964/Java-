/*
 Polymorphism-It is used to perform more than a single task from given class or method.
 Types of polymorphism
 1)method overloading-When we use same method in different classes with different parameter is called method 
                       overloading.It is also called as static binding
 2)method overriding-When we use same method in different classes is called method overriding.It is also called
                      as dynamic binding.
 */
class Mybill{
    void bill(int p1,int p2)
    {
        System.out.println("Amount: "+(p1+p2));
    }
}
class Mybill2 extends Mybill{
    void bill(int p3,int p4,int p5)
    {
        System.out.println("Amount: "+(p3+p4+p5));
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Mybill2 b=new Mybill2();
        b.bill(13, 13);
        b.bill(99, 99, 99);
    }
}
