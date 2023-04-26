package package_program.multithreading;

public class Syncronizedzz {
    public void printData() throws InterruptedException{
        for(int i=1;i<20;i++){
            Thread.sleep(1000);
            System.out.println("My Syn :"+Thread.currentThread().getName() +i );
        }
    }
}

class MyPrintThread extends Thread {
    Syncronizedzz myObj;

    public void myPrintThread(Syncronizedzz myObj) {
        this.myObj = myObj;
    }

    @Override
    public void run() {
        System.out.println("Himanshu" + this.myObj);
        try {
            myObj.printData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DrivePrint{
    public static void main(String[] args) {
        Syncronizedzz s = new Syncronizedzz();
        MyPrintThread m = new MyPrintThread();
        m.start();

//        MyPrintThread p = new MyPrintThread();
//        p.start();
    }
}