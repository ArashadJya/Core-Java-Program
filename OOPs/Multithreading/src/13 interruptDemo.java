
class MyThread extends Thread {
    public void run() {
        while (true) {
            if (Thread.interrupted()) {
                System.out.println("Thread was interrupted, but I won't stop yet.");
                 break; // Agar yeh likhenge to thread ruk jaayega
            } else {
                System.out.println("Working...");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted during sleep.");
                Thread.currentThread().interrupt(); // interrupt flag wapas set karna
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        t.interrupt();  // Thread ko interrupt signal bhejna
    }
}
