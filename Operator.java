/*
 Operator-It is symbol which is used to perform operation.

 Types of Operator:
 1)Arithmetic-Mathematical calculations
 
 
 2)Relational/comparision-It check single condition if condition is true it give true ,otherwise
                          it give false.
 3)Logical Operator:It check two conditions :
   Types of Logical Operator:
    1)Logical AND(&&)-If both condition is true it give true ,otherwise it give false.
    2)Logical OR(||)-If anyone condition is true it give true.
    3)Logical Not(!)-It print Opposite of given condition.

  4)Ternary operator:It check three conditions:
    syntax:
        condition?expression 1:expression 2;

        If condition is true it give expression 1,otherwise it give expression 2.
 */
public class Operator {
    public static void main(String[] args) {
        //Arithmeitc

        int a=24,b=4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);//Modulus -Remainder

        System.out.println("-------------------------------------------");

        //Relational
        System.out.println(a==b);//false
        System.out.println(a<=b);//false
        System.out.println(a>=b);//true
        System.out.println(a<b);//false
        System.out.println(a>b);//true
        System.out.println(a!=b);//true

        System.out.println("-------------------------------------------");

        //Logical Operator
        int n1=23,n2=45,n3=67,n4=89;
        System.out.println(n1<n2 && n3>n4);
        System.out.println(n1<n2 || n3>n4);
        System.out.println(!(n1<n2 || n3>n4));

        
        System.out.println("-------------------------------------------");

        //ternary
       int t1=23,t2=45,t3=56,t4=67,t5=89,t6=100;
       boolean result=(t1<t2)?(t3<t4):(t5<t6);
       System.out.println(result);

    }
}
