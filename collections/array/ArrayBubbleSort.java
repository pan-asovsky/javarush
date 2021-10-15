package javarush.collections.array;

import java.util.Arrays;

/*
    Сортировка пузырьком. Сортирует массив по возрастанию. Сложность O(n2).
 */

public class ArrayBubbleSort {

    public static void main(String[] args) {

        int[] numbers = new int[35];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array) {

        // Двойной проход по циклу с заменой.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}