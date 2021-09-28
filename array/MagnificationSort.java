package javarush.array;

/*
Сортировка по возрастанию.
 */
public class MagnificationSort {

    public int[] sort(int[] array) {

        // Переменная temp получает значение наименьшего числа
        // и записывает его в array[i].
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } return array;
    }
}
