package MethodExampl;

public class Recurs {
    //    static String printNumbers(int n) {
//        if (n <= 0) return "";
//
//        return printNumbers(n - 1) + " " + n;
//
//    }
//
//    public static void main(String[] args) {
//        String str = printNumbers(10000);
//        System.out.println(str);
//
//    }
//    static int fibonaci(int n) {
//        if (n <= 0) return 0;
//        int value = fibonaci(n - 1);
//        return value + n;
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            System.out.println("fib" + fibonaci(i));
//        }
//    }
    static int fibonacci(int n) {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);


    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("fib" + " " + fibonacci(i));
        }


    }
}