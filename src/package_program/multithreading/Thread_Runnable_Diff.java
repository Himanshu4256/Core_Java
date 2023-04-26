package package_program.multithreading;

//USING THREAD CLASS

//public class Thread_Runnable_Diff extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Hi Himanshu");
//    }
//    public void run(int a) {
//        System.out.println("Hi Himanshu");
//    }
//
//
//    public static void main(String[] args) {
//        Thread_Runnable_Diff d = new Thread_Runnable_Diff();
//        d.start();
//
//    }
//}

// USING RUNNABLE INTERFACE
public class Thread_Runnable_Diff implements Runnable //] -> Change
{
    @Override
    public void run() {
        System.out.println("Hi Himanshu");
    }
    public void run(int a) {
        System.out.println("Hi Himanshu");
    }


    public static void main(String[] args) {

        Thread_Runnable_Diff d = new Thread_Runnable_Diff();          //]
        Thread t = new Thread(d);   //] -> Change
        t.start();                  //]

    }
}

