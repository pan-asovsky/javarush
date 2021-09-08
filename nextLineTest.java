package javarush;

import java.util.Scanner;

public class nextLineTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your words here: ");
        String userString = sc.nextLine();
        System.out.println("Your words are: " + userString);
    }
}
