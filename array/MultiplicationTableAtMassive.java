package javarush.array;

/*
Таблица умножения
*/

public class MultiplicationTableAtMassive {

    // объявление двумерного массива
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

        // динамическая инициализация массива
        MULTIPLICATION_TABLE = new int[10][10];

        // заполнение массива таблицой умножения
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = ((i + 1) * (j + 1));
            }
        }

        // вывод массива в виде двумерной таблицы
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                System.out.print(MULTIPLICATION_TABLE[k][l] + " ");
            } System.out.println();
        }
    }
}
