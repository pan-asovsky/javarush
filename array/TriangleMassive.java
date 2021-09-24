package javarush.array;

/*
Треугольный массив
*/

public class TriangleMassive {

    // Динамическая инициализация первого параметра ступенчатого массива.
    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        // Цикл для динамической инициализации вторых параметров ступенчатого массива.
        for (int i = 1; i <= result.length; i++) {
            result[i - 1] = new int[i];
        }

        // Заполнение значений массива суммой индексов.
        int indexSum;
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < result[j].length; k++) {
                indexSum = (j + k);
                result[j][k] = indexSum;
            }
        }

        // Вывод в консоль ступенчатого массива.
        for (int l = 0; l < result.length; l++) {
            for (int m = 0; m < result[l].length; m++) {
                System.out.print(result[l][m] + " ");
            } System.out.println();
        }
    }
}
