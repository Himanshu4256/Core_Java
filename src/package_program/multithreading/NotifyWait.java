package package_program.multithreading;

class Song{
    void printData(){

    }
}

class TukaRamJi extends Thread{
    Song sng;

    public TukaRamJi(Song sng){
        this.sng=sng;
    }

    @Override
    public void run() {
        try {
            System.out.println("before wait.....");
            synchronized (sng){
                sng.wait();
            }
            System.out.println("After wait..");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class TaanSenJi extends Thread{
    Song sng;
    public TaanSenJi(Song sng){
        this.sng = sng;
    }

    @Override
    public void run() {
        try {
            System.out.println("before notify.....");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        synchronized (sng){
            sng.notify();
        }
        System.out.println("After Notify........");
    }
}

class DemoThread{
    public static void main(String[] args) {
        Song s = new Song();
        TaanSenJi t = new TaanSenJi(s);
        t.start();
        TukaRamJi t2 = new TukaRamJi(s);
        t2.start();
    }
}