 class timer extends Thread{
     @Override
     public void run() {
         int i=0;
         int x=0;
         int y=0;
         while (true){
             i+=1;
             try{
                 Thread.sleep(1000);
             } catch (InterruptedException e) {

             }
             if (i>59){
                 x=x+1;
                 i=0;
             }
             if (x>59){
                 y=y+1;
                 x=0;
             }
             if(y>24){
                 y=0;
             }
             System.out.printf("\r%02d:%02d:%02d",y,x,i);
         }
     }

     public static void main(String[] args) {
         timer t=new timer();
         t.start();
     }
 }
