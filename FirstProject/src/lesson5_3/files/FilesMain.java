package lesson5_3.files;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesMain {

    static void writeExample() {
        MyFileWriter writer = new MyFileWriter("files" + File.separatorChar +
                "lesson5_3" + File.separatorChar +
                "inputExample.txt");
        writer.write("\n123\n000\n   +++");

    }
    static void readExample() {
        //File.separatorChar = '/';   ----------- Как присвоить сепаратору символ
        MyFileReader reader = new MyFileReader("files" + File.separatorChar +
                "lesson5_3" + File.separatorChar +
                "foreadExample.txt");
        System.out.println(reader.read());

    }
    static void loadUserDataExample() {
        UserDataReader dataReader = new UserDataReader("files" + File.separatorChar +
                "lesson5_3" + File.separatorChar +
                "userData.txt");
        try {
            dataReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataReader.show();
    }


    public static void main(String[] args) {
        //writeExample();
        //readExample();
        loadUserDataExample();
    }
}
