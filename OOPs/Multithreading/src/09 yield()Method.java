 class test6 extends Thread{
     @Override
     public void run() {
         for (int i=1;i<=5;++i){
             System.out.println(Thread.currentThread().getName()+" "+i);


         }
     }

     public static void main(String[] args)  {
         test6 t=new test6();
         t.start();
         for (int i=1;i<=5;++i){
             Thread.yield();
             System.out.println("Main Thread "+i);
         }
     }
 }
