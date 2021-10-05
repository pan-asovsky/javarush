package javarush.exceptions;

import java.util.ArrayList;
import java.util.HashMap;

// Работа с исключениями через блок try-catch.

public class SimpleExceptions {

    public static void main(String[] args) {

        arithmeticExc();
        numberFormatExc();
        stringNullPointerExc();
        arrayIndexOutOfBoundsExc();
        indexOutOfBoundsExc();
        mapNullPointerExc();
    }

    // Деление на ноль.
    public static void arithmeticExc() {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    // Неверный формат для преобразования.
    public static void numberFormatExc() {

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    // Неприминимый метод к null-строке.
    public static void stringNullPointerExc() {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    // Обращение к несуществующему элементу массива.
    public static void arrayIndexOutOfBoundsExc() {

        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    // Получение несуществующего элемента List.
    public static void indexOutOfBoundsExc() {

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    // Вывод в консоль null-Map.
    public static void mapNullPointerExc() {

        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
