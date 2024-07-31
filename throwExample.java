import java.util.Scanner;
public class throwExample {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            throw new Exception("not eligible");
        }
        else
        {
            System.out.println("eilgible");
        }
        
    }
}
