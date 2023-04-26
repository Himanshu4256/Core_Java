package package_program.multithreading;

class BookTheaterSeat {
    int total_seats = 10;
   synchronized void bookSeat(int seats) // yha synchronized ni lgane se O/P sahi ni aa rha tha Bcoz dono Threads es cond m jaa rahe the
                                         // But synchronized lgane se jo phle aaega wahi execute krega usi ko prioty milegi
   {
        if(total_seats>=seats){
            System.out.println(seats+" seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("Seats Left : "+total_seats);
        }
        else {
            System.out.println("Sorry seats can't be booked!!");
            System.out.println("Seats Left :"+total_seats);
        }
    }
}

class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    static public void main(String[] args){
        b=new BookTheaterSeat(); // yha BookTheaterSeat cls ka obj pass kiya hai jiska ref static Var ma Hai.

        MovieBookApp D = new MovieBookApp();
        D.seats=7;
        D.start();


        MovieBookApp A = new MovieBookApp();
        A.seats=6;
        A.start();
    }
}