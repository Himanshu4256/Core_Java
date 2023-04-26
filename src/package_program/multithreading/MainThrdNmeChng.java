package package_program.multithreading;

public class MainThrdNmeChng extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Before Name Change : "+Thread.currentThread().getName());

        Thread.currentThread().setName("Himanshu"); // yha main Thread ka Name Change Ho gya.
        //Thread.currentThread().getName();
        System.out.println("After Name change : "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive()); // check krega thread hai ya dead ho gya


        MainThrdNmeChng m = new MainThrdNmeChng();
        m.start();
        System.out.println(m.isAlive()); // may be false or true depends on kitni der mai m execute ho rha hai.
    }
}
