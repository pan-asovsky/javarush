package javarush.arrayList;

import org.jetbrains.annotations.NotNull; //optional
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSorter {

    public int findLargestNum(@NotNull ArrayList<Integer> integers) {

        // Метод toArray() класса Array преобразует списочный массив в массив элементов.
        // Аргументом передаётся массив необходимого типа.
        // Для лучшей оптимизации он передаётся пустым.
        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);
        return (array[array.length - 1]);
    }

    public int findSmallestNum(@NotNull ArrayList<Integer> integers) {

        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);
        return (array[0]);
    }

    public String findShortestString(ArrayList<String> array) {

        int minStringSize = 0;
        for (String string : array) {
            if (string.length() < minStringSize) {
                minStringSize = string.length();
            }
        }

        String shortestString = "";
        for (String string : array) {
            if (string.length() == minStringSize) {
                shortestString = string;
            }
        } return shortestString;
    }

    public String findLargestString(ArrayList<String> array) {

        int maxStringSize = 0;
        for (String string : array) {
            if (string.length() > maxStringSize) {
                maxStringSize = string.length();
            }
        }

        String largestString = "";
        for (String string : array) {
            if (string.length() == maxStringSize) {
                largestString = string;
            }
        } return largestString;
    }
}