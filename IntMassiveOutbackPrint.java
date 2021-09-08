package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из чисел в обратном порядке
*/

public class IntMassiveOutbackPrint {
    public static void main(String[] args) throws Exception {

        // динамическая инициализация массива на 10 элементов
        int[] data = new int[10];

        // вызов класса для чтения и запись пользовательских чисел в массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userInt;
        for (int i = 0; i < 10; i++) {
            userInt = Integer.parseInt(reader.readLine());
            data[i] = userInt;
        }

        // вывод массива в обратном порядке
        for (int j = 9; j >= 0; j--) {
            System.out.println(data[j]);
        }
    }

}
