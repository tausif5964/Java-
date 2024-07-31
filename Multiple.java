/*
 Multiple inheritance -when we inherit two or more interface into a single
 class is called multiple inheritance
 */
interface Deposit{
    void dep();
}
interface withdrawn{
    void with();
}

class Finalinherit implements Deposit,withdrawn{
  float amount=15000;
    

    @Override
    public void with() {
       float w=6000;
       System.out.println("withdrawn: "+(amount-w));  
    }
    @Override
    public void dep() {
        int dp=5000;
        System.out.println("Deposit: "+(amount+dp));
    }

}
public class Multiple {
    public static void main(String[] args) {
             Finalinherit f=new Finalinherit();
             f.dep();
             f.with();        
    }
}
