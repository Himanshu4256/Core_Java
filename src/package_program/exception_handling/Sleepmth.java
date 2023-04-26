package package_program.exception_handling;

public class Sleepmth implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(1000); // Basically Thread ko 2 sec tak sleep kraega.
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<20;i++){
            System.out.println("Himanshu"+i);
        }
    }

    public static void main(String[] args) {
        Runnable_sThread r = new Runnable_sThread();

        Thread t = new Thread(r,"Java Lover"); // esme r Runnable_sThread k obj ko call kiya hai. jisse jb ham start mth bnae to "Runnable_sThread" class wala run call ho wrna "THread" wali class ka call ho jaega.
        t.start(); // ab ye Thread class k obj se Runnable_sThread ka mth call krega.

        for(int i=0;i<20;i++){
            System.out.println("----Yes----");
        }
        System.out.println(""+t.getName());
    }

}
