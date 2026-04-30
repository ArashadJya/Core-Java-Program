 class interruptMethod extends Thread {
     @Override
     public void run() {
         try{
             for (int i=1;i<=5;++i){
                 Thread.sleep(1000);
                 System.out.println(i);

             }
         } catch (InterruptedException e) {
             System.out.println("Thread was interrupted during sleep");
         }
     }

     public static void main(String[] args) {
         interruptMethod t=new interruptMethod();
         t.start();
         //interrupt method tabhi kam karta hai jab thread me sleep() ho ya wait() ho
         t.interrupt();
     }
 }
