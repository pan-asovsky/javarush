package javarush;
import java.io.IOException;

/*
Проверка на палиндром
*/

public class CheckPalindrome {

    public static void main(String[] args) throws IOException {

        String userWord = UserInput.readUserString();

        String answer = isPalindrome(userWord) ? "Yes." : "No.";
        System.out.println("- \"" + userWord + "\" is palindrome?\n" + "- " + answer);
    }

    public static boolean isPalindrome(String word) {

        // Создание объекта класса StringBuilder, использование
        // методов reverse() и toString().
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return word.equalsIgnoreCase(builder.toString());
    }
}

