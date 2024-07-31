public class Nestedifelse {
    public static void main(String[] args) {
        int a=34,b=45,c=67,d=78,e=89,f=100;
        if(a<b)
        {
            if(c>d)
            {
                System.out.println("2nd");
                if(e<f)
                {
                  System.out.println("3rd");
                }
            }
            
            System.out.println("1st");
        }
        else{
            System.out.println("None of these");
        }
    }
    
}
