package Exceptions.Lesson3.Homework3.CheckersClasses;

import Exceptions.Lesson3.Homework3.PersonalDataClasses.FIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckFio {
    public static String[] checkFIO() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ваши ФИО в одну строку через пробел: ");
            try {
                ArrayList<String> fullFIO = new ArrayList<>(List.of(iScanner.nextLine().split("\\s+")));
                if (fullFIO.size() > 3) {
                    throw new RuntimeException("Вы ввели лишние данные");
                }
                FIO fio = new FIO(fullFIO.get(0), fullFIO.get(1), fullFIO.get(2));
                fio.checkPersonalData();
                return new String[]{fullFIO.get(0), fullFIO.get(1), fullFIO.get(2)};
            } catch(IOException e){
                System.out.println("В ФИО не должно быть цифр или других символов!\n");
            } catch (IndexOutOfBoundsException e){
                System.out.println("ФИО введено не полностью!");
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }



    }
}
