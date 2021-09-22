package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Методы для чтения ввода.
*/

public class UserInput {

    public static String readUserString() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userString = reader.readLine();
        reader.close();
        return userString;
    }

    public static int readUserInt() {

        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        scanner.close();
        return  userInt;
    }
}
