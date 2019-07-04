package MethodExampl;

public class IfInMethod {
    public static String arrayToString(int[] arr) {
        return arrayToString(arr, arr.length);
    }

    public static String arrayToString(int[] arr, int count) {
        if (count < 0) throw new IllegalArgumentException("count < 0 !!!");
        String result = "";
        for(int i = 0; i < arr.length && i < count; i++)
            result += arr[i] + " ";
        return result;
    }

    public static void main(String[] args){
            int[] array = {1, 2, 3, 10, 150};
            int[] array2 = {10, 20, 30, 30, 0, -150};
            System.out.println(arrayToString(array, -1) + "\n" + arrayToString(array2, 3));
        }

    }
