package javarush.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Конвертер систем счисления.
 */

public class NumberSystemConverter {

	private static final String shutdown = "Завершение работы.";
	private static final String continueWork = """
						Продолжить?
						1 - Да.
						0 - Выход.
						""";
	private static final String binaryNum = "Введите двоичное число: ";
	private static final String octalNum = "Введите восьмеричное число: ";
	private static final String decimalNum = "Введите десятичное число: ";
	private static final String hexNum = "Введите шестнадцатеричное число: ";

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("""
					Доступные конвертации:
					1.  Восьмеричное в десятичное.
					2.  Десятичное в восьмеричное.
					3.  Двоичное в десятичное
					4.  Десятичное в двочное.
					5.  Шестнадцатеричное в десятичное.
					6.  Десятичное в шестнадцатеричное.
					7.  Двоичное в восьмеричнре.
					8.  Восьмеричное в двоичное.
					9.  Восьмеричное в шестнадцатеричное.
					10. Шестнадцатеричное в восьмеричное.
					11. Двоичное в шестнадцатеричное.
					12. Шестнадцатеричное в двоичное.
					0.  Выход.

					Введите число соответствующее вашему выбору:\s""");

			int userChoice = sc.nextInt();

			if (userChoice == 0) {
				sc.close();
				System.out.println(shutdown);
				break;

			} else if (userChoice == 1) {

				System.out.println(octalNum);
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber
						+ ") = 10(" + DecimalOctal.toDecimal(octalNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 2) {

				System.out.println(decimalNum);
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 8(" + DecimalOctal.toOctal(decimalNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}


			} else if (userChoice == 3) {

				System.out.println(binaryNum);
				String binaryNumber = reader.readLine();
				System.out.println("2(" + binaryNumber
						+ ") = 10(" + DecimalBinary.toDecimal(binaryNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 4) {

				System.out.println(decimalNum);
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 2(" + DecimalBinary.toBinary(decimalNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 5) {

				System.out.println(hexNum);
				String hexNumber = reader.readLine();
				System.out.println("16(" + hexNumber
						+ ") = 10(" + DecimalHex.toDecimal(hexNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 6) {

				System.out.println(decimalNum);
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 16(" + DecimalHex.toHex(decimalNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 7) {

				System.out.println(binaryNum);
				String binaryNumber = reader.readLine();
				System.out.println("2(" + binaryNumber +  ") = 8("
						+ DecimalOctal.toOctal(DecimalBinary.toDecimal(binaryNumber)) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 8) {

				System.out.println(octalNum);
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber + ") = 2("
						+ DecimalBinary.toBinary(DecimalOctal.toDecimal(octalNumber)) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 9) {

				System.out.println(octalNum);
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber + ") = 16("
						+ DecimalHex.toHex(DecimalOctal.toDecimal(octalNumber)) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 10) {

				System.out.println(hexNum);
				String hexNumber = reader.readLine();
				System.out.println("16(" + hexNumber + ") = 8("
						+ DecimalOctal.toOctal(DecimalHex.toDecimal(hexNumber)) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 11) {

				System.out.println(binaryNum);
				String binaryNumber = reader.readLine();
				System.out.println("2(" + binaryNumber + ") = 16(" + BinaryHex.toHex(binaryNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}

			} else if (userChoice == 12) {

				System.out.println(hexNum);
				String hexNumber = reader.readLine();
				System.out.println("16(" + hexNumber + ") = 2(" + BinaryHex.toBinary(hexNumber) + ").");
				System.out.println(continueWork);

				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println(shutdown);
					sc.close();
					break;
				}
			}
		}
	}
}
