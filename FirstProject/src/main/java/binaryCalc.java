import java.util.Scanner;

public class binaryCalc {
    public static void main(String[] args) {
        int n, count = 0, a;
        String x = "";

       Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter any decimal number:");
//        int s = scanner.nextInt();
//
//
//        System.out.println(Integer.toBinaryString(s));
//        System.out.println(Integer.toOctalString(s));
//        System.out.println(Integer.toHexString(s));

        n = 56;
        while(n > 0)
        {
            a = n % 8;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 8;
        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);


    }
}

