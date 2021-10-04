package javarush.collections.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строк в обратном порядке
*/

public class MassiveOutbackPrint {
    public static void main(String[] args) throws Exception {

        // динамическая инициализация массива на 10 элементов
        String[] data = new String[10];

        // вызов класса BufferedReader, в качестве аргумента которому передаётся
        // класс InputStreamReader, аргумент которого - поток System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        // заполнение массива значениями пользовательского ввода
        for (int i = 0; i < 8; i++) {
            userInput = reader.readLine();
            data[i] = userInput;
        }

        // вывод элементов массива в обратном порядке
        for (int j = 9; j >= 0; j--) {
            System.out.println(data[j]);
        }
    }
}
