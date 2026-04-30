class Andashop{
    int total_egg=200;
    void andasalae(int egg){
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
        synchronized (this){   //this keyword can be used to as a current object reference
            if (total_egg>=egg){
                System.out.println("yes you can buy a "+egg+" egg");
                total_egg=total_egg-egg;
                System.out.println("Your remaining egg is "+total_egg);
            }
            else{
                System.out.println("You can not buy a "+ egg+" egg because my total egg is "+total_egg);
                System.out.println("My total egg is "+total_egg);
            }
        }
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
//        System.out.println("Hi"+Thread.currentThread().getName());
    }
}
class customer extends Thread {
    static Andashop a;
    int egg;

    @Override
    public void run() {
      a.andasalae(egg);
    }

    public static void main(String[] args) {
        a=new Andashop();

        customer arashad=new customer();
        arashad.egg=100;
        arashad.start();

        customer khan =new customer();
        khan.egg=90;
        khan.start();

        customer jya=new customer();
        jya.egg=40;
        jya.start();
    }
}
