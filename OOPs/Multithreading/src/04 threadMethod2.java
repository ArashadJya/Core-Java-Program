 class test2 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
        Thread.currentThread().setName("Thread create by user");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        test2 t=new test2();
        t.start();
        System.out.println("main "+Thread.currentThread().getName());
        System.out.println("main "+Thread.currentThread().isAlive());
        System.out.println("main "+t.isAlive());
    }
}
//sare sare thread ek sath execute honge isliye output bhi har bar different honge
