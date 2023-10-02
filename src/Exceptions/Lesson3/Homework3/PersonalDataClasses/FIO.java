package Exceptions.Lesson3.Homework3.PersonalDataClasses;

import java.io.IOException;

public class FIO {
    private String lastName;
    private String firstName;
    private String middleName;

    public FIO(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String toString() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    public String[] checkPersonalData() throws IOException {

        String fullFio = lastName + firstName + middleName;

        char[] fullFioCharArray = fullFio.toCharArray();

        for (char value : fullFioCharArray) {
            if (!Character.isAlphabetic(value)) {
                throw new IOException("В ФИО не должно быть цифр или других символов!");
            }
        }

        return new String[]{lastName, firstName, middleName};
//        return String.format("%s %s %s", lastName, firstName, middleName);
    }
}
