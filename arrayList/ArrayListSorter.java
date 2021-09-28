package javarush.arrayList;

import org.jetbrains.annotations.NotNull; //optional
import java.util.ArrayList;
import java.util.Arrays;

/*
Наибольшее число в ArrayList.
 */

public class ArrayListSorter {

    public int largestSort(@NotNull ArrayList<Integer> integers) {

        // Метод toArray() класса Array преобразует списочный массив в массив элементов.
        // Аргументом передаётся массив необходимого типа.
        // Для лучшей оптимизации он передаётся пустым.
        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);
        return (array[array.length - 1]);
    }
}