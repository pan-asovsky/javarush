package javarush.array;
import java.util.Arrays;

/*
Есть ли кто?
*/

public class BinarySearchInMassive {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

        // Копируются значения массива array, далее происходит сортировка копии массива.
        // После сортировки вызывается метод бинарного поиска.
        // Если искомое значение бинарного поиска найдено, то переменной index присваивается индекс значения.
        // Иначе переменная index получает отрицательное значение.
        // В методе System.out.println() проверяется условие равенства. Значение проверки true, либо false.
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, element);
        System.out.println(index >= 0);
    }
}
