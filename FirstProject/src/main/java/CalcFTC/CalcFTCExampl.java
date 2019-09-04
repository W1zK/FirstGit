package CalcFTC;

import java.util.Scanner;


public class CalcFTCExampl {
//    private static int deposite;
//    private static int percent;
//    private static int time;


//    static void info () {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите сумму депозита");
//        int deposit = scan.nextInt();
//        int percent = (int) 0.012;
//        int time = 28;
//        int result = deposit*percent*time+deposit;
//        System.out.println(result);
//
//    }


    //    static void calc () {
//        System.out.println(deposite*percent*time+deposite);
//
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму депозита");
        int d = scan.nextInt();
        float p = 0.012f;
        int t = 28;
        float result = d*p*t+d;
        System.out.println("выхлоп 1 " + result);
        System.out.println(result*p*t+result);
        System.out.println(result*p*t+result);

        }



    }

