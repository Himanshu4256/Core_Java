package package_program.multithreading;



// THREAD K OUTPUT PR HAMARA CONTROL NAHI HOTA.

class Demo extends Thread{
    @Override
    public void run() {
    for(int i=0; i<20; i++){
        System.out.println(i+"MyThreadrun");
    }
    }
}
public class ThreadDemo{
    public static void main(String[] args)  // main() mth [main Thread] ko Run krta hai
    {
        Demo t = new Demo();
        t.start(); // create the thread
        Thread t1 = Thread.currentThread();
        System.out.println(t1);

        String n = t.getName();
        System.out.println(n);

        for(int i=0;i<20;i++)
        {
            System.out.println("Main Block :"+Thread.currentThread().getName());
        }

    }
}
