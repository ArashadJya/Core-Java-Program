//This synchronized method is explained by MovieBookingApp
class BookTheaterSeat{
    int total_seats=10;
   synchronized void bookSeat(int seats,String name){
        if(total_seats>=seats){
            System.out.println( name+" Seats booked sucessfully");
            total_seats=total_seats-seats;
            System.out.println("seats left "+total_seats);
        }
        else{
            System.out.println( name+" Seats can not be booked");
            System.out.println("Seats left "+total_seats);
        }
    }
}
 class MoivieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;
    String name;
    @Override
    public void run() {
        b.bookSeat( seats,name);
    }

    public static void main(String[] args) {
         b=new BookTheaterSeat();

        MoivieBookApp arashad=new MoivieBookApp();
        arashad.seats=5;
        arashad.name="Arashad";
        arashad.start();

        MoivieBookApp jya=new MoivieBookApp();
        jya.seats=4;
        jya.start();

        MoivieBookApp arif=new MoivieBookApp();
        arif.seats=5;
        arif.start();
    }
}
