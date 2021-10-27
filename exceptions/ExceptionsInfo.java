package javarush.exceptions;

import java.util.ArrayList;
import java.util.HashMap;

/**

    Рассматриваем работу с исключениями и принцип их работы.

    # При возникновении ошибки в процессе выполнения программы исполняющая среда JVM
    создает объект нужного типа из иерархии исключений Java – множества возможных
    исключительных ситуаций, унаследованных от общего предка – класса Throwable.

    Дерево наследования Throwable..

        Throwable:
            | __ Error (Unchecked):
                    | _ _ _ ThreadDeath
                    | _ _ _ IOError
                    | _ _ _ AWTError
                    | _ _ _ AssertionError
                    | _ _ _ ExceptionInInializerError
                    | _ _ _ VirtualMachineError
                            | _ _ _ _ _ _ _ OutOfMemoryError
                            | _ _ _ _ _ _ _ StackOverflowError
            | __ Exception:
                    | _ _ _ RuntimeException: (Unchecked)
                            | _ _ _ _ _ _ _ ArithmeticException
                            | _ _ _ _ _ _ _ ClassCastException
                            | _ _ _ _ _ _ _ IllegalArgumentException
                            | _ _ _ _ _ _ _ IllegalStateException
                            | _ _ _ _ _ _ _ NoSuchElementException
                            | _ _ _ _ _ _ _ NullPointerException
                            | _ _ _ _ _ _ _ IndexOutOfBoundsException
                                            | _ _ _ _ _ _ _ ArrayIndexOutOfBoundsError
                                            | _ _ _ _ _ _ _ StringIndexOutOfBoundsError
                    | _ _ _ CheckedException:
                            | _ _ _ _ _ _ _ SQLException
                            | _ _ _ _ _ _ _ ClassNotFoundException
                            | _ _ _ _ _ _ _ CloneNotSupportedException
                            | _ _ _ _ _ _ _ BrokenBarrierException
                            | _ _ _ _ _ _ _ IOException
                                            | _ _ _ _ _ _ _ EOFException
                                            | _ _ _ _ _ _ _ FileNotFoundException
                                            | _ _ _ _ _ _ _ MalformedURLException
                                            | _ _ _ _ _ _ _ UnknownHostException
                                            | _ _ _ _ _ _ _ SocketException

    #! Неконтролируемые. (Unchecked). Error.

        # Cитуации, при которых восстановление
        дальнейшей нормальной работы программы невозможно.

        # Это ошибки, возникающие при выполнении программы в результате
        сбоя работы JVM, переполнения памяти или сбоя системы.

        # К этой группе также относят RuntimeException – исключения,
        наследники класса Exception, генерируемые  JVM во время выполнения программы.

    #! Контролируемые. (Сhecked).

        # К ним относятся ситуации, предвидимые еще на стадии
        написания программы, и для которых должен быть написан код обработки.

        # Такие исключения являются контролируемыми (checked).
        Основная часть работы с исключениями – обработка таких ситуаций.

    ________________________________________________________________________________________

    #! try-catch-finally.

        # При возбуждении исключения в блоке try обработчик исключения ищется
        в следующем за ним блоке catch.

        # Если в catch есть обработчик данного типа исключения – управление
        переходит к нему. Если нет, то JVM ищет обработчик этого типа исключения
        в цепочке вызовов методов до тех пор, пока не будет найден подходящий catch.

        # После выполнения блока catch управление передается в необязательный блок finally.

        # В случае, если подходящий блок catch не найден, JVM останавливает
        выполнение программы, и выводит стек вызовов методов – stack trace,
        выполнив перед этим код блока finally при его наличии.


        # Блок finally обычно используется для того, чтобы закрыть открытые
        в блоке try потоки или освободить ресурсы. Однако при написании
        программы не всегда возможно уследить за закрытием всех ресурсов.

        # Для облегчения нашей жизни разработчики Java предложили нам конструкцию
        try-with-resources, которая автоматически закрывает ресурсы, открытые в блоке try.

    public String input() throws MyException {
        String s = null;

        // Открывая BufferedReader в блоке try, конструкция
        // try-with-resources автоматически его закроет.

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
            if (s.equals("")){
                throw new MyException ("String can not be empty!");
            }
            return s;
}


 */


// Работа с исключениями через блок try-catch.

public class ExceptionsInfo {

    public static void main(String[] args) {

        arithmeticExc();
        numberFormatExc();
        stringNullPointerExc();
        arrayIndexOutOfBoundsExc();
        indexOutOfBoundsExc();
        mapNullPointerExc();
    }

    // Деление на ноль.
    public static void arithmeticExc() {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    // Неверный формат для преобразования.
    public static void numberFormatExc() {

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    // Неприминимый метод к null-строке.
    public static void stringNullPointerExc() {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    // Обращение к несуществующему элементу массива.
    public static void arrayIndexOutOfBoundsExc() {

        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    // Получение несуществующего элемента List.
    public static void indexOutOfBoundsExc() {

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    // Вывод в консоль null-Map.
    public static void mapNullPointerExc() {

        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
