//is program me main method wait karega run method ke compelete hone tak
 class joinMethod extends Thread{
     @Override
     public void run() {

        try{
            for (int i=1;i<=5;++i){
                System.out.println("Child Thread "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {

        }
     }
     public static void main(String[] args) throws InterruptedException {
         joinMethod t=new joinMethod();
         t.start();
         t.join();
         /* join() jis thread par laga hoga wo pahle execute hoga and jis thread ke dwarabke dwara call hoga wo wait karega pahle wale thread ke execution khatm hone tak */
        try{
            for (int i=1;i<=5;++i){
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }

     }
 }
