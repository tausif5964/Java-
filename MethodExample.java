class Company{//classname
    String name;
    String location;//data member
    String post;

    void insert(String x,String y,String z)//method with parameter
    {
        name=x;
        location=y;
        post=z;
    }

    void display()
    {
        System.out.println("Name:"+name+" location: "+location+" post: "+post);
    }

}
public class MethodExample {
    public static void main(String[] args) {
        Company c1=new Company();
        Company c2=new Company();//objects
        
        c1.insert("TCS", "Mihan", "System engineer");
        c1.display();

        c2.insert("Persitent", "IT Park", "Cloud Computing engineer");
        c2.display();

    }
    
}
