package package_program.multithreading;

public class CurrentThread extends Thread{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("5 MyName :"+Thread.currentThread().getName()); // thread name
        System.out.println("6 MyClass :"+Thread.currentThread().getClass());

        Thread.currentThread().setName("Logic"); // Here Change the Thread Name
        System.out.println("7 Latest Name :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("1 :"+t);
        System.out.println("2 Class Name :"+Thread.currentThread().getClass());
        System.out.println("3 Thread Name :"+Thread.currentThread().getName());

        CurrentThread c = new CurrentThread();
        c.start(); // ye thread create krega && run() Method ko call bhi krega.

        t.setName("Programming");
        System.out.println("4 Latest Name :"+Thread.currentThread().getName());   // clear the DOUBT

    }
}
