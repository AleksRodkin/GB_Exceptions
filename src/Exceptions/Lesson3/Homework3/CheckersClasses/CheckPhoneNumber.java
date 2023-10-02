package Exceptions.Lesson3.Homework3.CheckersClasses;

import Exceptions.Lesson3.Homework3.PersonalDataClasses.PhoneNumber;

import java.io.IOException;
import java.util.Scanner;

public class CheckPhoneNumber {
    public static String checkNumber() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ваш номер телефона, используя только цифры: ");
            try {
                PhoneNumber phoneNumber = new PhoneNumber(iScanner.nextLine());
                return phoneNumber.checkPersonalData();
            } catch(IOException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат номера телефона!\n");
            }
        }
    }
}
