package javarush.converter;
import java.util.Objects;

/*
Двоичный конвертер
*/

public class DecimalBinary {

    public static String toBinary(int decimalNumber) {

        String binaryNumber = "";

        if (decimalNumber <= 0) {
            return binaryNumber;
        } else {
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber = decimalNumber / 2;
            } return binaryNumber;
        }
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
    }
}

