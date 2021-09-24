package javarush;

/*
Количество слов в строке
*/

public class WordsCount {

    // Метод String.split() создает массив подстрок,
    // разбивая входную строку по одному или нескольким разделителям.
    public static int getWordCount(String string) {
        return string.split(" ").length;
    }
}
