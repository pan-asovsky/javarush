package javarush.converter;

/*
Шестнадцатеричный конвертер
*/

public class DecimalHex {

    private static final String HEX = "0123456789abcdef";

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }

        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}

