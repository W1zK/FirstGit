package lesson5_3.files;

import java.io.*;
import java.util.Scanner;

public class MyFileReader {
    private String path;

    public MyFileReader(String path) {
        this.path = path;
    }
    public String read() {
        try {
            FileInputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\Z");
            String data = scanner.next();
            scanner.close();
            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }





    }
}
