package package_program.multithreading;

public class Demo2 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Himanshu"+i);
        }
    }
    public void run(String s){
        for(int i=0;i<5;i++){
            System.out.println("Sharma"+i);
        }
    }
    @Override
    public void start() //yha ye start,run dono ko call krega. Boz [super.start();] lga hua hai - agr ese hta de to sirf start hi call hoga.
    {
        super.start();
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Demo2 d =new Demo2();
        d.start();
        for(int i=0;i<5;i++){
            System.out.println("Ji"+i);
        }
    }
}
