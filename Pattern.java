public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)//rows
        {
            for(int j=5;j>=1;j--)//column
            {
                if(j<i)
                {
                    
               System.out.print("* ");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
