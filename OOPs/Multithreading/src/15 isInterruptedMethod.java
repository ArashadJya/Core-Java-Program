 class isInterruptedMethod extends Thread{
     @Override
     public void run() {
         System.out.println(Thread.currentThread().isInterrupted());//status not change true->true
         try{
             for (int i=1;i<=5;++i){
                 System.out.println(i);
                 System.out.println(Thread.currentThread().isInterrupted());
                 Thread.sleep(1000);
             }
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted "+e);
         }
     }
     public static void main(String[] args) {
         isInterruptedMethod t=new isInterruptedMethod();
         t.start();
         t.interrupt();
     }
 }
