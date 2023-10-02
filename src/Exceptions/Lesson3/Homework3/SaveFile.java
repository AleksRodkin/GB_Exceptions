package Exceptions.Lesson3.Homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private static String absolutePath = new File("").getAbsolutePath();
    private static String fullPath = absolutePath + "/src/Exceptions/Lesson3/Homework3/ClientData/";

    public static String getPath() {
        return fullPath;
    }

    public static void setPath(String path) {
        SaveFile.fullPath = path;
    }

    public static String fileExtension(String fileName, String extension){
        return getPath() + fileName + "." + extension;
    }

    public static void savePersonalData(String extension,
                                 String[] fullFio, /*lastName, String firstName, String middleName,*/
                                 String dateOfBirth, String phoneNumber, String gender) {
        String fileName = SaveFile.fileExtension(fullFio[0], extension);
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("<" + fullFio[0] + ">" + "<" + fullFio[1] + ">" + "<" + fullFio[2] + ">" + "<" + dateOfBirth + ">" + " " + "<" + phoneNumber + ">" + "<" + gender + ">" + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
