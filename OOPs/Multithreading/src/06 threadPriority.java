 class test4  extends Thread{
     @Override
     public void run() {
         System.out.println("child thread");
         System.out.println("child Thread priority "+Thread.currentThread().getPriority());
     }
     public static void main(String[] args) {
         System.out.println("Main thread old priority "+Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(4);
         System.out.println("Main Thread new Priority "+Thread.currentThread().getPriority());
         test4 t=new test4();
         t.setPriority(9);
         t.start();
     }
}
