/*
 Loop is used to repeat single statement multiple times till the given condition is true if 
 condition become false it will break.

 Types of loop:
 1)while loop:It check condition first and then print statement.
     syntax:
         Initialization;
         while(condition)
         {
            statement ;
            step;
         }
 2)do while loop-It print statement first and then check condition.It print statement atleast one 
 time if condition is true.
    syntax:
         Initialization;
         do{
            statement ;
            step;
         }while(condition);
 3)for loop-It perform three expression at a time .
   syntax:
      for(Initialization;condition;step)
      {
        statement;
      }

 */
public class LoopExample {
       public static void main(String[] args) {
           //while 
           int a=10;
           while(a>=1)
           {
               System.out.println(a);
               a-=2;//value decrease by 2.
           }

           System.out.println("-----------------------------------");

           //do while
           char i=65;
           do{
              System.out.print(i+" ");
              i++;
           }while(i>=90);

           //for loop
           
           System.out.print("-----------------------------------");
           for(int s=1;s<=10;s++)
           {
             System.out.println(s+"="+s*s);
           }
       }    
}
