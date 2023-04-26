package package_program.multithreading;

public class Waiter implements Runnable{
    private Message_2 msg;
    public Waiter(Message_2 m){
        this.msg = m;
    }
    @Override
    public void run() {
       String name = Thread.currentThread().getName();
       synchronized (msg){
           System.out.println(name +"wait for notified at Time"+System.currentTimeMillis());
           try {
               msg.wait();
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
           System.out.println(name+"waiter"+System.currentTimeMillis());
           System.out.println(name+"Processed"+msg.getMsg(name + "Notifier work Done"));
       }
    }
}
