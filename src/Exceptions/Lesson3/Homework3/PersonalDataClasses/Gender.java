package Exceptions.Lesson3.Homework3.PersonalDataClasses;

import java.io.IOException;
import java.util.Objects;

public class Gender {
    private String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format("%c", gender);
    }

    public String checkPersonalData() throws IOException {
        if (Objects.equals(gender, "f") || Objects.equals(gender, "m") || Objects.equals(gender, "ж") || Objects.equals(gender, "м")) {
            return String.format("%s", gender);
        } else {
            throw new IOException("Неверное значение буквы-указателя пола!");
        }
    }
}
