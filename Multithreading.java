/*
 Multithreading:It is used to perform multiple tasks at a time using single thread class
.It is generally used for gaming and animations.
Note:Thread-It is a smallest processing unit which is in byte form.

Methods to create or perform multithreading:
1)extending thread class
2)implementing Runnable interface

Methods used in multithreading:
1)void start()-It is used to execute thread class.
2)public void run()-It is used to perform action which you want to perform with thread.
3)void sleep()-It is used to provide time interval between two or more threads.
Note:Always enclosed sleep method inside a try-catch block.(InterruptedException)

4)void stop():It is used to stop given thread class
 */



 //extending thread class
class Mythread extends Thread{
    public void run()
    {
            System.out.println("Calling my thread class");
    }
}

//using runnable interface-In this we require thread class to start action for interface

class  Myrun implements Runnable{

    @Override
    public void run() {
        System.out.println("Game on");
    }

}


public class Multithreading {
    public static void main(String[] args) {
            Mythread t=new Mythread();
            t.start();        

            Myrun r=new Myrun();
            Thread t1=new Thread(r);
            t1.start();

    }
}
