/*
 An array is used to store collection  of similar types of data using single variable.
 An array indexing start from 0 to n-1.
 Types of array:
 1)One dimensional-An array with single subscript is called one dimensional
 syntax:
          datatype arrayname[]=new datatype[size];

  2)Two dimensional -It is used to show data in tabular form using two subscript.
    syntax:
       datatype arrayname[][]=new datatype[rows][columns];

  3)Multidimensional array-When we use combination  two or more(2-D) array is called multidimensional array.
 */
public class ArrayExample {
    public static void main(String[] args) {
        //1-D

        int arr1[]=new int[5];//declare
        arr1[0]=45;
        arr1[1]=78;
        arr1[2]=89;
        arr1[3]=90;
        arr1[4]=100;
        System.out.println("The value of 2nd block is "+arr1[2]);

        //Initialize
        String students[]={"Sayali","Rushik","Shreyansh","Saksham"};

        for(int i=0;i<students.length;i++)
        {
            System.out.println("Student name is "+students[i]);
        }

        //2-D array
         int a[][]={{1,2,3},{4,5,6},{7,8,9},{9,8,7}};
         for(int r=0;r<4;r++)//row
         {
            for( int c=0;c<3;c++)
            {
                System.out.print(a[r][c]+" ");

            }
            System.out.println();
         }






    }
}
