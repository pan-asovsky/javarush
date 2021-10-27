package javarush;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        System.out.printf("Наибольший общий делитель чисел %s и %s равен %s%n",
                 first , second , findGreatestCommonDivisor(first, second));

    }

    public static int findGreatestCommonDivisor(int first, int second) {

        while (first != second) {
            if (first > second) {
                first -= second;
            }
            if (second > first) {
                second -= first;
            }
        }
        return first;
    }
}
