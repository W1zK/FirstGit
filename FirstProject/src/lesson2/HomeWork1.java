package lesson2;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Имя
        System.out.println("Введите ваше имя:");
        String Name = scanner.nextLine();
        //Фамилия
        System.out.println("Введите вашу фамилию:");
        String LastName = scanner.nextLine();
        //Возраст
        System.out.println("Введите ваш возраст:");
        String age = scanner.nextLine();
        //Дата рождения
        System.out.println("Введите ваш город рождения:");
        String firstCity = scanner.nextLine();
        //Город
        System.out.println("Введите ваш город проживания:");
        String city = scanner.nextLine();
        System.out.println("Введите ваш пол:");
        String gender = scanner.nextLine();
        //----------------------------ВЫВОД------------------------------------------------

        System.out.println("-------------------- PASSPORT --------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("-----");
        System.out.println("----- Person: " + Name + " " + LastName);
        System.out.println("-----");
        System.out.println("----- Gender: " + gender + ", age: " + age);
        System.out.println("-----");
        System.out.println("----- Location: from - " + firstCity + ", current - " + city);
        System.out.println("-----");
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");


    }
}
