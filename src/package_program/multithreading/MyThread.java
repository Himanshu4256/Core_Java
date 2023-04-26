package package_program.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Himanshu");
        }
    }
    public void run(String s){
        for(int i=0; i<20;i++){
            System.out.println("Sharma");
        }
    }
    public void start(){
        super.start();
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        for (int i=0;i<10;i++){
            System.out.println(i+"Student");
        }

    }
}
