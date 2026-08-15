 class test3 extends Thread {
     @Override
     public void run() {
         System.out.println("child Thread");
         System.out.println(Thread.currentThread().isDaemon()); //it is used to check this thread is Daemon or not
         System.out.println("kfnv");
     }
     public static void main(String[] args) {
         System.out.println("Main Thread");
         test3 t=new test3();
         t.setDaemon(true);
         System.out.println("aaa");
         t.start();

         System.out.println("bbb");
     }
 }
