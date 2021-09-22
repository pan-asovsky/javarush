package javarush.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Конвертер систем счисления.
 */

public class NumberSystemConverter {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Доступные конвертации:\n" +
					"1.  Восьмеричное в десятичное.\n" +
					"2.  Десятичное в восьмеричное.\n" +
					"3.  Двоичное в десятичное\n" +
					"4.  Десятичное в двочное.\n" +
					"5.  Шестнадцатеричное в десятичное.\n" +
					"6.  Десятичное в шестнадцатеричное.\n" +
					"7.  Двоичное в восьмеричнре.\n" +
					"8.  Восьмеричное в двоичное.\n" +
					"9.  Восьмеричное в шестнадцатеричное.\n" +
					"10. Шестнадцатеричное в восьмеричное.\n" +
					"11. Двоичное в шестнадцатеричное.\n" +
					"12. Шестнадцатеричное в двоичное.\n" +
					"0.  Выход.\n\n" +
					"Введите число соответствующее вашему выбору: ");

			int userChoice = sc.nextInt();

			if (userChoice == 0) {
				sc.close();
				System.out.println("Завершение работы.");
				break;

			} else if (userChoice == 1) {

				System.out.println("Введите восьмеричное число: ");
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber
						+ ") = 10(" + DecimalOctal.toDecimal(octalNumber) + ").");

				System.out.println("Продолжить?\n" +
									"1 - Да.\n" +
									"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 2) {

				System.out.println("Введите десятичное число: ");
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 8(" + DecimalOctal.toOctal(decimalNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 3) {

				System.out.println("Введите двоичное число: ");
				String binaryNumber = bufferedReader.readLine();
				System.out.println("2(" + binaryNumber
						+ ") = 10(" + DecimalBinary.toDecimal(binaryNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 4) {

				System.out.println("Введите десятичное число: ");
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 2(" + DecimalBinary.toBinary(decimalNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 5) {

				System.out.println("Введите шестнадцатеричное число: ");
				String hexNumber = bufferedReader.readLine();
				System.out.println("16(" + hexNumber
						+ ") = 10(" + DecimalHex.toDecimal(hexNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 6) {

				System.out.println("Введите десятичное число: ");
				int decimalNumber = sc.nextInt();
				System.out.println("10(" + decimalNumber
						+ ") = 16(" + DecimalHex.toHex(decimalNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 7) {

				System.out.println("Введите двоичное число: ");
				String binaryNumber = bufferedReader.readLine();
				System.out.println("2(" + binaryNumber +  ") = 8("
						+ DecimalOctal.toOctal(DecimalBinary.toDecimal(binaryNumber)) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 8) {

				System.out.println("Введите восьмеричное число: ");
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber + ") = 2("
						+ DecimalBinary.toBinary(DecimalOctal.toDecimal(octalNumber)) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 9) {

				System.out.println("Введите восьмеричное число: ");
				int octalNumber = sc.nextInt();
				System.out.println("8(" + octalNumber + ") = 16("
						+ DecimalHex.toHex(DecimalOctal.toDecimal(octalNumber)) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 10) {

				System.out.println("Введите шестнадцатеричное число: ");
				String hexNumber = bufferedReader.readLine();
				System.out.println("16(" + hexNumber + ") = 8("
						+ DecimalOctal.toOctal(DecimalHex.toDecimal(hexNumber)) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 11) {

				System.out.println("Введите двоичное число: ");
				String binaryNumber = bufferedReader.readLine();
				System.out.println("2(" + binaryNumber + ") = 16(" + BinaryHex.toHex(binaryNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}

			} else if (userChoice == 12) {

				System.out.println("Введите шестнадцатеричное число: ");
				String hexNumber = bufferedReader.readLine();
				System.out.println("16(" + hexNumber + ") = 2(" + BinaryHex.toBinary(hexNumber) + ").");

				System.out.println("Продолжить?\n" +
						"1 - Да.\n" +
						"0 - Выход.\n");
				int userChoiceToContinue = sc.nextInt();
				if (userChoiceToContinue == 0) {
					System.out.println("Завершение работы.");
					sc.close();
					break;
				} else if (userChoiceToContinue == 1) {
					continue;
				}
			}
		}
	}
}
