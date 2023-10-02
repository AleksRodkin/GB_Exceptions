package Exceptions.Lesson3.Homework3.CheckersClasses;

import Exceptions.Lesson3.Homework3.PersonalDataClasses.Gender;

import java.io.IOException;
import java.util.Scanner;

public class CheckGender {
    public static String checkGender() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите ваш пол (м/m или ж/f): ");
            try {
                Gender gender = new Gender(iScanner.nextLine());
                return gender.checkPersonalData();
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
