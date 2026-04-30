
class BookTheaterSeat1{
   static int total_seats=20;
  synchronized void bookseats(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" seats booked sucessfully");
            total_seats=total_seats-seats;
            System.out.println("Available seats "+total_seats);
        }
        else{
            System.out.println(seats+" seat can not be booked because available seats is "+total_seats);
            System.out.println("Seats available only "+total_seats);
        }
     try { Thread.sleep(5000); }
     catch (InterruptedException e) {}

 }
}
class myThread1 extends Thread{
    BookTheaterSeat1 b;
    int seats;
    myThread1(BookTheaterSeat1 b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookseats(seats);
    }
}
class myThread2 extends Thread{
    BookTheaterSeat1 b;
    int seats;
    myThread2(BookTheaterSeat1 b,int seats){
        this.b=b;
        this.seats=seats;
    }
    @Override
    public void run() {
        b.bookseats(seats);
    }
}
 class MovieBookapp {
     public static void main(String[] args) {
         BookTheaterSeat1 b1=new BookTheaterSeat1();
         myThread1 t1=new myThread1(b1,7);
         t1.start();
         myThread2 t2=new myThread2(b1,6);
         t2.start();

         BookTheaterSeat1 b2=new BookTheaterSeat1();
         myThread1 t3=new myThread1(b2,1);
         t3.start();
         myThread2 t4=new myThread2(b2,9);
         t4.start();
     }
}
//is program me ham 2 object banaye hai isme ham movie dekhne ke liye seat book kar rahe hai and total seats 20
// hai to jab ham pahla object create karenge to total sete ki value 20 hai usi me se seat kam hona start ho
// jayega aur jab first object bexecute hona end hoga and second oibject execute hona start hoga to phir wah
// total seat ki value 20 hi hoga iske wajah se data inconsistency ki problem hogi but ham chahate hai ki
// pahle wala object execute  hone ke baad total seat jitni bachi ho usi me se seat book start hona suru ho
// iske liye hamne synchronized method ko static bana diya hai aur jab hamne method ko static bana diya hai
// to jo variable use hoga usko bhi static banana padega