package lesson2;

public class continueExampl {
    public static void main(String[] args) {
        int[] array = {5, 6, 245, -1, 0, -1926};
         int sum = 0;
         for(int value : array) {
             if (value <= 0) {
                 continue;
             }
            sum += value;

         }


        System.out.println("Sum:" + sum);
         
    }
}
