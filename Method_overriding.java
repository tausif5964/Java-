class Myplayer{
    void fav()
    {
        System.out.println("Rohit sharma");
    }
}
class Myplayer2 extends Myplayer{
    void fav()
    {
        System.out.println("Hardik Pandaya");
    }
}
class Myplayer3 extends Myplayer2{
    void fav()
    {
        System.out.println("MS Dhoni");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Myplayer3 p1=new Myplayer3();
        Myplayer2 p2=new Myplayer2();
        Myplayer p3=new Myplayer();

        p1.fav();
        p2.fav();
        p3.fav();
        
        
    }
    
}
