class test5 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;++i){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I am a catch block");
            }
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        test5 t=new test5();
        t.start();
    }
}
