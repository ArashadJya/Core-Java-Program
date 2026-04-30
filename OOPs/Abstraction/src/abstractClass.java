 abstract class vehicle {
   abstract void start();
   int no_of_wheel;
   void starts(){
       System.out.println("progran has been started");
   }
}
class car extends vehicle{
    void start(){
        no_of_wheel=4;

        System.out.println("car starts with key");
        System.out.println("number of wheel "+no_of_wheel);
    }
}
class scooter extends vehicle{
    void start() {
        no_of_wheel=2;
        System.out.println("scooter starts with kick");
        System.out.println("Number of wheel "+no_of_wheel);
    }
    public static void main(String[] args) {
        car c=new car();
        c.starts();
        c.start();
        scooter s=new scooter();
        s.starts();
        s.start();
    }
}
