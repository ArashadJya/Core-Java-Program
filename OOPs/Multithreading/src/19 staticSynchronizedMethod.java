class StaticSyncExample {
    public static synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (n * i));
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
        }
    }
}

class Thread5 extends Thread {
    StaticSyncExample obj;
    Thread5(StaticSyncExample obj){
        this.obj=obj;
    }
    public void run() {
       obj.printTable(7);
    }
}

class Thread6 extends Thread {
    StaticSyncExample obj;
     Thread6(StaticSyncExample obj) {
         this.obj=obj;
    }

    public void run() {
         obj.printTable(6);
    }
}

 class StaticSyncTest {
    public static void main(String[] args) {
       StaticSyncExample s1=new StaticSyncExample();
      Thread5 t5=  new Thread5(s1);
      t5.start();
      StaticSyncExample s2=new StaticSyncExample();
       Thread6 t6= new Thread6(s2);
       t6.start();
    }
}

