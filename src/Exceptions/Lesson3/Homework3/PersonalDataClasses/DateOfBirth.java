package Exceptions.Lesson3.Homework3.PersonalDataClasses;

import java.io.IOException;
import java.time.Year;

public class DateOfBirth {
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public DateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String toString() {
        return String.format("%d.%d.%d", dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public String checkPersonalData() throws IOException {

        if (dayOfBirth > 31 || dayOfBirth < 1 ) {
            throw new IOException ("Некоректное значение дня");
        } if (monthOfBirth > 12 || monthOfBirth < 1) {
            throw new IOException("Некоректное значение месяца");
        } if (yearOfBirth > Year.now().getValue() || yearOfBirth < 1900) {
            throw new IOException("Некоректное значение года");
        }
        return String.format("%d.%d.%d", dayOfBirth, monthOfBirth, yearOfBirth);
    }
}
