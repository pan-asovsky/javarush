package javarush.util;

import java.io.*;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        System.out.println("Введите путь к файлу: ");
        try {
            String pathToFile = UserInput.readUserString();
            readAndPrint(pathToFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void readAndPrint(String pathToFile) throws FileNotFoundException {

        FileInputStream inStream = new FileInputStream(pathToFile);
        Scanner sc = new Scanner(inStream);
        StringBuilder builder = new StringBuilder();

        while (sc.hasNextLine()) {
            builder.append(sc.nextLine()).append("\n");
        }
        System.out.print(builder.toString());
    }
}
