/*
How to take user input :

In java we have to use Scanner class to take input  which is already given in util package.
In java Construtor is call by using new keyword.

1)import java.util.Scanner;
2)Scanner object=new Scanner(System.in);
3)Tell java scanner in which form you want input using next().
  1)int age=object.nextInt();
  2)float height=object.nextFloat();
  3)String name=object.next();


 */
import java.util.Scanner;//step 1
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//step 2
        
        int age=sc.nextInt();
        float percent=sc.nextFloat();
        String name=sc.next();

        System.out.println("Details of Student");
        System.out.println("Age:"+age+  " Name:  "+name+" Percent: "+percent);
        sc.close();
    }
}
