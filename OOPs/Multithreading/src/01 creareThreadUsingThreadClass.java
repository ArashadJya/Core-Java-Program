 class threadClass extends Thread {
     @Override
     public void run() {
         System.out.println("thread tasks");
     }

     public static void main(String[] args) {
         threadClass t=new threadClass();
         t.start();

//         t.start(); we can not start thread again, it provides a thread exception
     }
 }
