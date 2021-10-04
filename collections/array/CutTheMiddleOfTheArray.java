package javarush.collections.array;

/*
Вырезаем середину
*/

public class CutTheMiddleOfTheArray {

    // статическая инициализация двумерного массива
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'g', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {

        printArray();

        // замена "внутренних" значений на дефис
        for (int j = 1; j < (chars[0].length - 1); j++) {
            chars[1][j] = '-';
            chars[2][j] = '-';
        }

        printArray();
    }

    // метод для печати двумерного массива в виде таблицы
        public static void printArray() {
            for (char[] aChar : chars) {
                for (char c : aChar) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}