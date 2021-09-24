package javarush.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class TwoMassiveAtOne {

    public static void main(String[] args) throws Exception {

        // динамическая инициализация трёх массивов
        int[] bigData = new int[20];
        int[] firstSmallData = new int[10];
        int[] secondSmallData = new int[10];

        // вызов класса для чтения и запись пользовательских чисел в первый массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userInt;
        for (int i = 0; i < 20; i++) {
            userInt = Integer.parseInt(reader.readLine());
            bigData[i] = userInt;
        }

        // копирование значений массива bigData в массивы firstSmallData и secondSmallData
        for (int j = 0; j < 10; j++) {
            firstSmallData[j] = bigData[j];
            secondSmallData[j] = bigData[j + 10];
        }

        // вывод значений массива
        for (int k = 0; k < 10; k++) {
            System.out.println(secondSmallData[k]);
        }
    }
}