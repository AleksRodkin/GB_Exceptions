package Exceptions.Lesson3.Homework3;

import Exceptions.Lesson3.Homework3.CheckersClasses.CheckDateOfBirth;
import Exceptions.Lesson3.Homework3.CheckersClasses.CheckFio;
import Exceptions.Lesson3.Homework3.CheckersClasses.CheckGender;
import Exceptions.Lesson3.Homework3.CheckersClasses.CheckPhoneNumber;

public class Controller {

    public static void CollectPersonalData(){

        SaveFile.savePersonalData("txt", CheckFio.checkFIO(), CheckDateOfBirth.checkDate(),
                CheckPhoneNumber.checkNumber(), CheckGender.checkGender());
        System.out.println("\nФайл успешно сохранён!");
    }

}
