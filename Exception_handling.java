/*
 Exception Handling:It is used to handle runtime errors in java.Runtime errors are also called
 logical error.try,catch and throw keyword is used to handle runtime errors in java.

 1)try-It show in which block of code error will occur.(without error)
 2)catch-It is used to show an exception for given error.(with error)
 3)throw-It is used to pass multiple exceptions using different conditions.
 */
public class Exception_handling {
    public static void main(String[] args) {

        //ArithmeticException
        int a=23,b=2;
        try {
        
        System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Divide by zero is not possible");
        }

        //NullPointerException
        String data=null;
        try {
        
            System.out.println("The length is "+data.length());    
        } catch (Exception e) {
            System.out.println("Value is null ");
        }

        //ArrayIndexoutofBoundsException
        int arr[]=new int[5];
        arr[0]=56;
        arr[1]=89;
        arr[2]=110;
        arr[3]=123;
        arr[4]=90;

        try {
            
        arr[5]=222;
        System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Memory is out of bounds");
        }

    }
}
