package Exceptions.Lesson3.Homework3.PersonalDataClasses;

import java.io.IOException;

public class PhoneNumber {

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return String.format("%s", phoneNumber);
    }

    public String checkPersonalData() throws IOException {

        if (phoneNumber.isEmpty()){
            throw new IOException("Вы ввели пустую строку");
        }

        char[] phoneNumberCharArray = phoneNumber.toCharArray();

        for (char value : phoneNumberCharArray) {
            if ((!Character.isDigit(value)) ) {
                throw new IOException("В номере телефона не должно быть букв и других символов!\n");
            }
        }

        return String.format("%s", phoneNumber);
    }
}
