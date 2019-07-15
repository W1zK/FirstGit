package lesson5_3.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataReader {
    private String path;
    private String userName;
    private int userAge;
    private String userFavoritWord;
    private int[] array;



    public UserDataReader(String path) {
        this.path = path;
    }

    public void read() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();    //Считали длину масива
        array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = scanner.nextInt();       //Считываем масив

        }
        scanner.nextLine();

        userName = scanner.nextLine();   // UserName
        userAge = scanner.nextInt();        //Age
        scanner.nextLine();
        userFavoritWord = scanner.nextLine();
        scanner.close();

        //-------------------------------------------------------------

    }
    public void show() {
        System.out.println("User name:\t\t\t" + userName);
        System.out.println("User age:\t\t\t" + userAge);
        System.out.println("Favorite word:\t" + userFavoritWord);
        System.out.println();
        System.out.println("Array Length = " + array.length);
        for(int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]" + array[i] + "   ");
        }
    }
}
