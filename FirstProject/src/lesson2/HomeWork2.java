package lesson2;
import java.util.Scanner;


public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X:");
        int x = scanner.nextInt();
        System.out.println("Введите Y:");
        int y = scanner.nextInt();

        int p = x + y;
        int u = x * y;
        int R = x - y;
        int M = x % y;
        double d = (double)x/ y;
        boolean m = x < y;
        boolean b = x > y;
        boolean r = x == y;

        System.out.println("Сумма " + p);
        System.out.println("Умножение " + u);
        System.out.println("Деление " + d);
        System.out.println("Разница " + R);
        System.out.println("Деление по модулю " + M);
        System.out.println("Равно " + r);
        System.out.println("x < y " + m);
        System.out.println("x > y " + b);

    }
}
