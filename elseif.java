
public class elseif {
    public static void main(String[] args) {
            String signal="Green";
            if(signal=="red")
            {
                System.out.println("Stop");
            }        
            else if(signal=="Yellow")
            {
                System.out.println("Get Ready");
            }
            else if(signal=="Green")
            {
                System.out.println("Go");
            }
            else{
                System.out.println("Signal not working");
            }
    }
    
}
