package lesson8.lesson8_1;

import java.util.concurrent.*;

public class TreadTasksExample {
    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }
        return sum;

    }
    static int result;

    public static void callable() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool (1);
        int[] arr = {1, 2, 3, 5, 2, 10, 500, 200, 8, 9, 11, 777};

        Runnable r = new Runnable() {
            @Override
            public void run() {
                result = sum(arr);

            }
        };
        Future futureRunnable = service.submit(r);
        futureRunnable.get();
        System.out.println(result);



        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return sum(arr);
            }
        };

        Future<Integer> futureCallable = service.submit(c);
        System.out.println("Callable = " + futureCallable.get());
        service.shutdown();
    }
    private static void futureTask() throws ExecutionException, InterruptedException {
        int[] arr = {1, 3, 4, 123, 15, 8, 5, 8, 9};
        FutureTask<Integer> task = new FutureTask<Integer>(() -> {
            return sum(arr);
        });
        new Thread(task).start();
        System.out.println("Summ = " + task.get());

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable();
        futureTask();



    }
}
