package javarush;
import java.util.Arrays;

/*
Заполняем массив
*/

public class FillMassive {

    public static int[] array = new int[3];
    public static int valueStart = 0;
    public static int valueEnd = 1;

    public static void main(String[] args) {

        // Если длина массива чётная, то он заполняется значениями valueStart и valueEnd поровну.
        // Ежели нет, то valueStart заполняет большую часть. Оставшуюся - valueEnd.
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, (array.length / 2), valueStart);
            Arrays.fill(array, (array.length / 2), array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, (array.length / 2 + 1), valueStart);
            Arrays.fill(array, (array.length / 2 + 1), array.length, valueEnd);
        }

        // Метод toString класса Arrays позволяет вывести в консоль одномерный массив.
        System.out.println(Arrays.toString(array));
    }
}

