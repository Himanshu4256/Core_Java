package Learning_Java11.lambda_expression.SeprateLambdaWork;

public class ThreadCreationUsnThread {
    public static void main(String[] args) {

        Runnable thread1 = () ->{
          // this is thread body in this we give the task to thread

            for (int i = 0; i < 10; i++) {
                System.out.println("Value of i is :"+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();

        Runnable t2 =()->{
            try {
                for (int i = 0; i <=10 ; i++) {
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t22 = new Thread(t2);
        t22.start();
    }
}
