package javarush.collections.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class StreetAndHouses {
    public static void main(String[] args) throws IOException {

        // вызов класса для чтения, объявление массива и заполнение массива числами с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] countResidents = new int[15];
        for (int i = 0; i < 15; i++) {
            countResidents[i] = Integer.parseInt(reader.readLine());
        }

        int evenNum = 0;
        int oddNum = 0;

        // суммирование значений чётных и нечётных индексов массива
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                evenNum += countResidents[i];
            } else {
                oddNum += countResidents[i];
            }
        }

        if (evenNum > oddNum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (oddNum > evenNum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
