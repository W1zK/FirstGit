package lesson8;

public class MultiThreadWaitExample {
    static int x = 3;
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;
            while (seconds < x) {
                try {
                    seconds++;
                    Thread.sleep(1000);         //sleep 1 sec
                    System.out.println(Thread.currentThread().getName() + "   " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }

            }

            System.out.println(Thread.currentThread().getName());
        }
    };
    public static void main(String[] args) throws InterruptedException {

        Thread thread;

        thread=new Thread(runnable);
        thread.start();
        thread.join();

        thread=new Thread(runnable);
        thread.start();
        thread.join();

        thread=new Thread(runnable);
        thread.start();
        thread.join();
    }
}
