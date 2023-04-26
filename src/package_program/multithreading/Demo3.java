package package_program.multithreading;

public class Demo3 extends Thread{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println("MySir :"+Thread.currentThread().getName());
        System.out.println("Welcomes".getClass());
        Thread.currentThread().setName("Hero");
        System.out.println("Your Thread :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       // Thread t = new Thread.currentThread();
        //System.out.println(t);
        System.out.println("Hollo :"+Thread.currentThread().getClass());
        System.out.println("Hello :"+Thread.currentThread().getName());
        Demo3 d= new Demo3();
        d.start();
        d.setName("Main is changed");
        System.out.println("Main :"+Thread.currentThread().getName());
    }
}