package package_program.multithreading;

public class MyJaan implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("--My Jaan Thread--");
        }
        mth();
    }
    void mth(){
        System.out.println("mth Method");
    }
    public static void main(String[] args) {
        MyJaan m = new MyJaan();
        Thread t = new Thread("Jaan 2");
        t.start();
        for(int i=0;i<10;i++){
            System.out.println(",,,,Yes,,,,");
        }
        System.out.println(t.getName());
    }
}


