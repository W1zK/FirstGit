package lesson8;

public class TreadExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //code execute in thread
                System.out.println("first thread");

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
