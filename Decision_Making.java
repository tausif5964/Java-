/*
Decision Making:It is used to print statement  according to the condition .

Types of statement :
1)if statement -It check only single statement ,It print only true statement.
2)if else statement -In this we check two statement ,if block for true and else block for false.

3)else if statement -It check multiple statements but it print only the first true statement .

4)Nested if else statement-When we use if condition inside another if condition.
5)switch statement  -It print only single statement from multiple cases.
  In this user choose which statement he want to print.

  Syntax:
       switch(expression)
       {
          case 1:
            statement;
            break;
            
          case 2:
            statement;
            break;
            
          case 3:
            statement;
            break;

            default:
               statement;

       }
 
 */
import java.util.Scanner;
public class Decision_Making {
     public static void main(String[] args) {
               //if statement
               
               int a=34,b=45;
               if(a>b)
               {
                System.out.println("Hello");
               }
               System.out.println("World");


               //if else

               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();

               if(n>=10 && n<=50)
               {
                System.out.println("Nice Guess");

               }
               else{
                System.out.println("Sorry you are wrong");
               }
               sc.close();
     }           
}
