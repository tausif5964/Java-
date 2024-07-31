public class Multidimensional {
  public static void main(String[] args) {
      int a[][]={{2,3},{4,5}};//
      int b[][]={{6,7},{8,9}};
      int c[][]=new int[2][2];//store combination in c


      //condition
      for(int i=0;i<2;i++)//row
      {
          for(int j=0;j<2;j++)//columns
          {
            c[i][j]=a[i][j]+b[i][j];
          }
      }

      //Matrix Mulitiplication

      for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
        {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
      }


  }    
}
