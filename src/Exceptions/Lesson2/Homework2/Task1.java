package Exceptions.Lesson2.Homework2;


import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод
// дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число (через точку): ");
            try {
                Float aFloat = Float.valueOf(iScanner.nextLine());
                System.out.printf("Вы ввели %f", aFloat);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число.");
            }
        }
        iScanner.close();
    }
}

