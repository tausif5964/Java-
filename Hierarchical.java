class Shape{//base
    int a,b;

    public void setdata(int m,int n)
    {
        a=m;
        b=n;
    }
}
class Rectangle extends Shape{
    public int rec_get()
    {
        int result=a*b;
        return result;
    }
}
class Triangle extends Shape{
    public float tri_get()
    {
        float result=0.5F*a*b;
        return result;
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();

        r.setdata(12, 5);
        System.out.println("Area of rectangle is "+r.rec_get());

        t.setdata(13, 5);
        System.out.println("Area of triangle is "+t.tri_get());
    }
    
}
