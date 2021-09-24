package javarush.array;
import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class StepwiseMassive {

    public static int[][] multiArray;

    public static void main(String[] args) {

        // Чтение с консоли, динамическая инициализация первого параметра массива введённым числом.
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        multiArray = new int[userNum][];

        // Динамическая инициализация второго параметра массива вводом с консоли.
        int userInt;
        for (int i = 0; i < userNum; i++) {
            userInt = sc.nextInt();
            multiArray[i] = new int[userInt];
        }

        // Вывод в консоль мномерного массива.
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
