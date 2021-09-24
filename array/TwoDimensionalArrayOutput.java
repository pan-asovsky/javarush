package javarush.array;
import java.util.Arrays;

/*
Выводим двумерные массивы
*/

public class TwoDimensionalArrayOutput {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {

        String stringsPrint = Arrays.deepToString(strings);
        String intsPrint = Arrays.deepToString(ints);
        System.out.println(stringsPrint);
        System.out.println(intsPrint);
    }
}