package lesson8.lesson8_1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    static String[] book = new String[] {
            "page_0: qw",
            "page_1: 12323wersdfwefq",
            "page_2: qwqweqwe",
            "page_3: fghfghfghfghfg",
            "page_4: zxcxzczxczxczxc"
    };
    static AtomicInteger atomicPage = new AtomicInteger(0);
    static Runnable onUpdate = () -> {
        System.out.println(book[x]);
    };
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (true) {
            System.out.println("type page");
            int page = scaner.nextInt();
            atomicPage.set(page);
        }

    }
}
