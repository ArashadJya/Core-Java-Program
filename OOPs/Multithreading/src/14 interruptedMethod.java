 class interruptedMethod extends Thread {
     @Override
     public void run() {
//         System.out.println(Thread.interrupted());//status change from true to false
         try{
             for (int i=1;i<=5;++i){
                 System.out.println(i);
//                 System.out.println(Thread.interrupted());
                 Thread.sleep(1000);
             }
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted "+e);
         }
     }

     public static void main(String[] args) {
         interruptedMethod t=new interruptedMethod();
         t.start();
         t.interrupt();
     }
 }
