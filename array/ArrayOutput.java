package javarush.array;
import java.util.Arrays;

/*
Выводим массивы
*/

public class ArrayOutput {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {

        String stringsPrint = Arrays.toString(strings);
        String intsPrint = Arrays.toString(ints);
        System.out.println(stringsPrint);
        System.out.println(intsPrint);
    }
}
