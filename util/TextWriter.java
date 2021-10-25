/*package javarush.util;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class TextWriter {

    public static void main(String[] args) {

        System.out.println("Введите путь и имя файла: ");
        try {
            String fileName = UserInput.readUserString();
            writeToFile(fileName);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл с таким именем уже существует!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка!");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        StringBuilder builder = new StringBuilder();

        String userText = reader.readLine();
        if (userText.equals("exit")) {
            return;
        } else {
            while (!userText.equals("exit")) {
                userText = reader.readLine();
                builder.append(userText).append("\n");
            }
        }
        writer.write(builder.toString());

        reader.close();
        writer.close();
    }
}
*/

package javarush.util;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class TextWriter {

    public static void main(String[] args) {

        System.out.println("Введите путь и имя файла: ");
        StringBuilder builder = new StringBuilder();

        try {
            String fileName = UserInput.readUserString();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            String userText = reader.readLine();
            if (userText.equals("exit")) {
                return;
            } else {
                while (!userText.equals("exit")) {
                    userText = reader.readLine();
                    builder.append(userText).append("\n");
                }
            }
            writer.write(builder.toString());
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл с таким именем уже существует!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка!");
            e.printStackTrace();
        }
    }
}


