//isme child thread wait karega main method ke execution compelete hone tak kyuki isme join(), run()
// ke andar define kiya gya hai
class joinMethod1 extends Thread{
     static Thread mainThread;
     @Override
     public void run()  {
         try{
             for (int i=1;i<=5;i++){
                 mainThread.join();
                 System.out.println("child Thread "+i);
                 Thread.sleep(1000);
             }
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }

     public static void main(String[] args) {
          mainThread=Thread.currentThread();
         joinMethod1 t=new joinMethod1();
         t.start();
         try{
             for (int i=1;i<=5;++i){
                 System.out.println("Main Thread "+i);
                 Thread.sleep(1000);
             }
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
