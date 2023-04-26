package package_program.exception_handling;

public class Thread_Priority  extends Thread
{
    @Override
    public void run() {
        System.out.println("Yes"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread_Priority tp = new Thread_Priority();
        System.out.println(tp.getPriority()); // Default Priority Thread ki "5" Hoti Hai.
        tp.setPriority(10);
        System.out.println(tp.getPriority());

        tp.setPriority(Thread_Priority.MAX_PRIORITY);
        tp.setPriority(Thread_Priority.MIN_PRIORITY);
        tp.setPriority(Thread_Priority.NORM_PRIORITY);

        tp.start();

        System.out.println("Yes"+Thread.MIN_PRIORITY);
        System.out.println("Yes"+Thread.MAX_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY+"Yes"+Thread.currentThread().getPriority());
    }
}
