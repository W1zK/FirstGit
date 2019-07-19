package lesson8.lesson8_1;

public class EventExample {

    public static void dowload(Runnable onComplete) {
        System.out.println("Start download");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download finished");
        onComplete.run();

    }
    public static void main(String[] args) {
        Runnable onComplete = () -> {
            System.out.println("Уведомление пользователя о завершении загрузки");
        };
        Runnable dowloadInThread = () -> {
            dowload(onComplete);
        };
        new Thread(dowloadInThread).start();
    }
}
