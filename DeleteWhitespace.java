package javarush;

/*
Удаление пробелов.
 */

public class DeleteWhitespace {

    public String deleteWhitespaces(String userText) {

        // Удаление пробелов методом replace() класса String.
        return userText.replace(" ", "");
    }
}
