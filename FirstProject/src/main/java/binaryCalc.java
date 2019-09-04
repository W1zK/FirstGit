import java.util.Scanner;

public class binaryCalc {
    private static int n, count = 0, a;
    private static String x = "";

    public static void binaryCode(){

        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:" + x);



    }

    public static void OctalCode(){
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
        System.out.println("Octal number:"+x);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnterNumber");
        n = scanner.nextInt();




        binaryCode();
//        OctalCode();




    }

}

