package javarush.cycle;

import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // нахождение среднего при разных значениях всех трёх чисел
        if (((a > b) & (b > c)) | ((a < b) & (b < c))) {
            System.out.println(b);
        } else if (((b > a) & (a > c)) | ((b < a) & (a < c))) {
            System.out.println(a);
        } else if (((a > c) & (c > b)) | ((a < c) & (c < b))) {
            System.out.println(c);
        }

        // нахождение среднего при двух одинаковых значениях
        else if (a == b) {
            System.out.println(a);
        } else if (a == c) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(b);
        }

        // нахождение среднего при одинаковых значениях трёх чисел
        else if ((a == b) & (b == c)) {
            System.out.println(a);
        }
    }
}
