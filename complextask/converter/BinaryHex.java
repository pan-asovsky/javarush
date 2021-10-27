package javarush.complextask.converter;

/*
Двоично-шестнадцатеричный конвертер
*/

public class BinaryHex {

    public static String toHex(String binaryNumber) {

        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        // Создание объекта класса StringBuilder
        StringBuilder temp = new StringBuilder();

        // Метод append() класса String преобразует
        // переданный объект в строку и добавляет его к текущей строке.

        // Проверка длины строки binaryNumber на остаток от деления на четыре.
        // Добавление нулей в начало строки для доведения до деления без остатка.
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();

        // Метод substring() класса String возвращает подстроку, заданную
        // интервалом символов. Последний индекс в интервал не входит.

        // Цикл проверяет подстроку полученную методом substring() на совпадение
        // с заданными строками, определяя шестнадцатеричное представление.
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element = switch (substring) {
                case "0001" -> "1";
                case "0010" -> "2";
                case "0011" -> "3";
                case "0100" -> "4";
                case "0101" -> "5";
                case "0110" -> "6";
                case "0111" -> "7";
                case "1000" -> "8";
                case "1001" -> "9";
                case "1010" -> "a";
                case "1011" -> "b";
                case "1100" -> "c";
                case "1101" -> "d";
                case "1110" -> "e";
                case "1111" -> "f";
                default -> "0";
            };
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {

        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        // Цикл сверяет символы шестнадцатеричного представления с
        // соответствующим им двоичным кодом.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if(hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}
