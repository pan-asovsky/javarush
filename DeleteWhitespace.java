package javarush;

/*
Удаление пробелов.
 */

public class DeleteWhitespace  {

    public static String deleteWhitespace(String userText) {

        // Удаление пробелов методом replace() класса String.
        return userText.replace(" ", "");
    }
}
