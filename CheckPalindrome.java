package javarush;
import java.io.IOException;

/*
Проверка на палиндром
*/

public class CheckPalindrome {

    public static void main(String[] args) throws IOException {

        String userWord = UserInput.readUserString();

        String answer = isPalindrome(userWord) ? "Да." : "Нет.";
        System.out.println("- Слово \"" + userWord + "\" палиндром?\n" + "- " + answer);
    }

    public static boolean isPalindrome(String word) {

        // Разбинение слова на две части с учётом количества символов.
        String firstPart = "";
        String secondPart = word.substring(word.length() / 2);

        if (word.length() % 2 == 0) {
            firstPart = word.substring(0, word.length() / 2);
        } else {
            firstPart = word.substring(0, word.length() / 2 + 1);
        }

        // Сравниваем строки игнорируя регистр.
        return firstPart.equalsIgnoreCase(reversePart(secondPart));
    }

    public static String reversePart(String secondPart) {

        // Переворот второй части, приведение объекта к строке.
        StringBuilder builder = new StringBuilder(secondPart);
        return builder.reverse().toString();
    }
}

