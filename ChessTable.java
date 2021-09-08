package javarush;

import java.util.Scanner;

/* 
Шахматная доска
*/

public class ChessTable {
    public static char[][] chessTable;

    public static void main(String[] args) {

        // Считывание ввода с консоли, динамическая инициализация массива.
        Scanner sc = new Scanner(System.in);
        int sideSize = sc.nextInt();
        chessTable = new char[sideSize][sideSize];

        // Заполнение массива. Проверка суммы переменных цикла
        // по делению на 2 без остатка с разделением по результату.
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessTable[i][j] = '#';
                } else {
                    chessTable[i][j] = ' ';
                }
            }
        }

        // Вывод двумерного массива в консоль двумерной таблицей.
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable[0].length; j++) {
                System.out.print(chessTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
