/*Throw Example 
 Note:Use throws in main 
*/
import java.util.Scanner;
public class throwExample2 {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
             throw new Exception("not eligible");
        }
        else{
            System.out.println("eligible");
        }
    }
}
