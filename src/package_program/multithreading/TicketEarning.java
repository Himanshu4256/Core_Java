package package_program.multithreading;
class MovieBookAppp extends Thread{
    int total = 0;
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            total = total+100;
           // System.out.println(total);
        }
    }
}
public class TicketEarning {
    public static void main(String[] args) {
        MovieBookAppp m = new MovieBookAppp();
        m.start();
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("Total Earning : "+m.total+"rs");
    }
}
