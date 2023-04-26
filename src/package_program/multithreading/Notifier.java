package package_program.multithreading;

public class Notifier implements Runnable{
    private Message_2 msg;
    public Notifier(Message_2 msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+"Stored");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        synchronized (msg){
            msg.getMsg(name+"Notifier work Done");
            msg.notifyAll();
        }
    }
}