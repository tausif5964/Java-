/*
 Exception Handling:-It is used to handle runtime error(logical) using try-catch and throw keyword.

 try-It show in which block error will occur.(If there will be no error)
 catch-It show exception for given error.(if there is error)
throw-It pass exceptions when user want pass exception according to specific condition.
 */
public class Exception_Handling3 {
    public static void main(String[] args) {
        //Arithmetic Exceptions
        try {
            int i=100/5;
        System.out.println(i);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Divide by zero is mistake");
        }


        //NullpointerException
        try {
            
        String name=null;
        System.out.println(name.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Length of null string cannot be taken");
        }

        //ArrayIndexoutofboundsException

        int arr[]=new int [5];
        arr[0]=89;
        arr[1]=78;
        arr[2]=78;
        arr[3]=78;
        arr[4]=78;
        try {
            
        arr[5]=100;
        System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println("Out of bounds Exception");
        }
    }
    
}
