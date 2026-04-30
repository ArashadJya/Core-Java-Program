import java.util.Scanner;

class BooktheaterSeats{
    int total_seats=20;
    synchronized  void bookSeats(int seats,String name){
        if(total_seats>=seats){
            System.out.println(name+", your seats has been bookes sucessfully ");
            total_seats=total_seats-seats;
            System.out.println("remaining seats is "+total_seats);
        }
        else{
            System.out.println(name+", you can not book sucessfully ");
            System.out.println("remaining seats is "+total_seats);
        }
    }
}
 class MovieBooking  extends Thread{
    static BooktheaterSeats b;
    int seats;
    String name;

    public MovieBooking(String name, int seats) {
        this.name=name;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats,name);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a name");
        String name1=sc.nextLine();
        System.out.println("enter a seats that you want to book");
        int seat1=sc.nextInt();
        sc.nextLine();
        System.out.println("please enter a name");
        String name2=sc.nextLine();
        System.out.println("enter a seats that you want to book");
        int seat2=sc.nextInt();
         sc.nextLine();
        System.out.println("please enter a name");
        String name3=sc.nextLine();
        System.out.println("enter a seats that you want to book");
        int seat3=sc.nextInt();

        b=new BooktheaterSeats();

        MovieBooking javed=new MovieBooking(name1,seat1);
        javed.start();

        MovieBooking khan=new MovieBooking(name2,seat2);
        khan.start();

        MovieBooking arif=new MovieBooking(name3,seat3);
        arif.start();

    }
}
