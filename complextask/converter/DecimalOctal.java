package javarush.complextask.converter;

/*
Восьмеричный конвертер
*/

public class DecimalOctal {

    public static int toOctal(int decimalNumber) {

        if (decimalNumber <= 0) {
            return 0;
        } else {

            double octalNumber = 0;
            int i = 0;

            while (decimalNumber != 0) {
                octalNumber = octalNumber + (decimalNumber % 8) * Math.pow(10, i);
                decimalNumber = decimalNumber / 8;
                i++;
            } return (int) octalNumber;
        }
    }

    public static int toDecimal(int octalNumber) {

        if (octalNumber <= 0) {
            return 0;
        } else {

            double decimalNumber = 0;
            int i = 0;

            while (octalNumber != 0) {
                decimalNumber = decimalNumber + (octalNumber % 10) * Math.pow(8, i);
                octalNumber = octalNumber / 10;
                i++;
            }  return (int) decimalNumber;
        }
    }
}
