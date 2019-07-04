package MethodExampl;


public class MethodExampl {

    public static void printArray(short[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        short[] array = {1, 2, 3, 10, 150};
        printArray(array);
        short[] array2 = {10, 20, 30, 30, 0, -150};
        printArray(array2);
        short[] array3 = {15};
        printArray(array3);

    }
}
