package Exceptions.Lesson2.Homework2;

//Разработайте программу, которая выбросит Exception,
//когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки
//вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Попробуйте ввести пустую строку: ");
        while (true) {
            String someString = iScanner.nextLine();
            if (someString.isEmpty()) {
                System.out.println("АГА ПОПАВСЯ");
                System.out.println("А теперь введите что-нибудь для выхода из цикла:");
            } else {
                System.out.printf("Вы ввели %s", someString);
                break;
            }
        }
        iScanner.close();
    }
}
