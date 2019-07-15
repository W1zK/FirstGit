package lesson8;

import java.util.Scanner;

public class FixedTimerExample {
    static int x = 0;
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;
            while (seconds < x) {
                try {
                    seconds++;
                    Thread.sleep(1000);         //sleep 1 sec
                    System.out.println(seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }

            }


        }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предел отсчета");



        Thread thread;

        x = sc.nextInt();
        thread=new Thread(runnable);
        thread.start();

        x = sc.nextInt();
        thread=new Thread(runnable);
        thread.start();

        x = sc.nextInt();
        thread=new Thread(runnable);
        thread.start();
    }
}
