class medical extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try{

            System.out.println("Medical started");
            Thread.sleep(5000);
            System.out.println("Medical end");
            System.out.println("---------------------------------");
        } catch (InterruptedException e) {

        }
    }
}
class testDriver extends Thread{
    @Override
    public void run() {

        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test drive start");
            Thread.sleep(3000);
            System.out.println("Test drive end");
            System.out.println("-------------------------------");
        } catch (InterruptedException e) {

        }
    }
}
class officer extends Thread{
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Officer starts works");
            Thread.sleep(2000);
            System.out.println("Officer compelete process");
            System.out.println("----------------------------------");
        } catch (InterruptedException e) {

        }
    }
}
class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
        medical md=new medical();
        md.start();
        md.join();

        testDriver td=new testDriver();
        td.start();
        td.join();

        officer of=new officer();
        of.start();
    }
}
