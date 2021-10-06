package javarush.collections.array;

import javarush.util.UserInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные буквы
*/

public class VowelsAndConsonants {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        String userWord = UserInput.readUserString();

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for (Character w : userWord.toCharArray()) {
            if (isVowel(w)) {
                builder1.append(w).append(" ");
            } else if (w != ' ') {
                builder2.append(w).append(" ");
            }
        }

        System.out.println(builder1);
        System.out.println(builder2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
