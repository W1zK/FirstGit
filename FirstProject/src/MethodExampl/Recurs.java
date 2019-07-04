package MethodExampl;

public class Recurs {
    static String printNumbers(int n) {
        if (n <= 0) return "";

        return printNumbers(n - 1) + "" + n;

    }

    public static void main(String[] args) {
        String str = printNumbers(5);
        System.out.println(str);

    }

}
