class Totalearning extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; ++i) {
                total = total + 100;
            }
            this.notify();
        }
    }
    }
 class moviebookapp1 {
     public static void main(String[] args) throws InterruptedException {
         Totalearning te=new Totalearning();
         te.start();
         synchronized (te){
         System.out.println("Total earning  without wait() "+te.total+" rs");
             te.wait();
             System.out.println("Total earning is :"+te.total+" rs");
         }

     }
}
