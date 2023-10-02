package Exceptions.Lesson3.Homework3.CheckersClasses;

import Exceptions.Lesson3.Homework3.PersonalDataClasses.DateOfBirth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckDateOfBirth {
    public static String checkDate() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите вашу дату рождения через точку: ");
            try {
                ArrayList<String> fullDate = new ArrayList<>(List.of(iScanner.nextLine().split("\\.")));

                DateOfBirth date = new DateOfBirth(Integer.parseInt(fullDate.get(0)), Integer.parseInt(fullDate.get(1)), Integer.parseInt(fullDate.get(2)));
                return date.checkPersonalData();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Вы ввели недостаточно данных\n");
            } catch(IOException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат даты!\n");
            }
        }
    }
}
