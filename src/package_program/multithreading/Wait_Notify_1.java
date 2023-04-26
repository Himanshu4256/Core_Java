package package_program.multithreading;

public class Wait_Notify_1 {
    public static void main(String[] args) {
        Message_2 msg = new Message_2("Process It");
        //System.out.println(msg.getMsg());

        Waiter w = new Waiter(msg);
        new Thread(w,"Waiter 1").start();

        Waiter w1 = new Waiter(msg);
        new Thread(w1,"Waiter 2").start();

        Notifier n = new Notifier(msg);
        new Thread(n,"Notifier Thread").start();
    }
}