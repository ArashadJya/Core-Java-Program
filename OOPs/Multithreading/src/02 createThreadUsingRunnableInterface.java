 class test implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread tasks");
    }
   

    public static void main(String[] args) {
        test t=new test();
        Thread th=new Thread(t);
        th.start();
    }
}
