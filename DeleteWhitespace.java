package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Удаление пробелов.
 */

public class DeleteWhitespace  {

    public static void main(String[] args) throws IOException {

        System.out.println(deleteWhitespace(userInput()));
    }

    public static String userInput() throws IOException {

        // Создание объекта класса BufferedReader с аргументом
        // в виде объекта класса InputStreamReader, в который
        // передаётся текущий поток ввода (System.in).
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userText = reader.readLine();
        reader.close();
        return userText;
    }

    public static String deleteWhitespace(String userText) {

        // Удаление пробелов методом replace() класса String.
        return userText.replace(" ", "");
    }
}
