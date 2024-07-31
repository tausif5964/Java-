class Mysleep2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try {Thread.sleep(1000);} catch (InterruptedException e) 
            {System.out.println(e);}
            System.out.println(i);
        }
    }
}
public class SleepExample {
    public static void main(String[] args) {
        Mysleep2 s=new Mysleep2();
        s.start();
    }
}

