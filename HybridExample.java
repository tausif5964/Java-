/*
 Hybrid Inheritance -It is combination of two or more inheritance.
 */
abstract class Institute{
         abstract void branch();
}
class Branch extends Institute{//single

    @Override
    void branch() {
           String name="Disha Institute";
           String address="Sadar Nagpur";

           System.out.println("Name: "+name+" address "+address);
    }

}
interface SecondBranch{
    void second();
}
class Myfinal extends Branch implements SecondBranch{

    @Override
    public void second() {
        String name="Pratapnagar";
        System.out.println("Second Branch: "+name);
    }

}
public class HybridExample {
    public static void main(String[] args) {
        Myfinal f=new Myfinal();
        f.branch();
        f.second();
    }
}
