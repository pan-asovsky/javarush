package javarush.collections.stack;
import java.util.Arrays;

public class StackTraceInfo {

/**
    Рассматриваем работу методов класса StackTrace.


    # Список, состоящий из текущего метода, метода,
    который его вызвал, его вызвавшего метода и т.д., называется stack trace.

    # У объекта Thread есть метод getStackTrace(), который возвращает
    массив элементов StackTraceElement, каждый из которых содержит
    информацию об одном методе. Все элементы вместе и образуют stack trace.

    #! Получить его можно с помощью команды StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace(),
    где:
      * StackTraceElement[] - указание на тип массива. Примеры: int[], String[].
      * stackTrace - имя массива.
      * Thread - класс java.lang.Thread, поток.
      * currentThread() - получение ссылки на текущий поток в котором выполняются
      метода, которые мы хотим отследить.
      * getStackTrace() - получение всего Стэка вызываемых методов. Является простым getter StackTrace.


    # Когда в программе происходит ошибка и создается исключение,
    в него записывается текущий stack trace: массив, состоящий
    из списка методов начиная с метода main и заканчивая методом,
    где произошла ошибка. Там даже есть строка, в которой было создано исключение!

    Этот stack trace ошибки хранится внутри исключения и может быть легко
    извлечен из нее с помощью метода: StackTraceElement[] getStackTrace()


    #! Методы StackTraceElement:
      * String getClassName() - Возвращает имя класса.
      * String getMethodName() - Возвращает имя метода.
      * String getFileName() - Возвращает имя файла (в одном файле может быть много классов).
      * String getModuleName() - Возвращает имя модуля (может быть null).
      * String getModuleVersion() - Возвращает версию модуля (может быть null).
      * int getLineNumber() - Возвращает номер строки в файле, в которой был вызов метода.


*/

    // Вызов method1 из main.
    public static void main(String[] args) {
        System.out.println("method1: " + Arrays.toString(method1()));
    }

    // Получение stack trace метода через явное создание экземпляра класса.
    public static StackTraceElement[] method1() {
        System.out.println("method2 : " + Arrays.toString(method2()));
        return Thread.currentThread().getStackTrace();
    }

    // Получение stack trace неявным созданием экземпляра через возврат.
    public static StackTraceElement[] method2() {
        System.out.println("method3: " + method3());
        return Thread.currentThread().getStackTrace();
    }

    // Получение имени метода вызвавшего данный method3.
    public static String method3() {
        System.out.println("method4: " + method4());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    // Получение номера строки с которой был вызван данный method4 .
    public static int method4() {
        System.out.println("log: ");
        log("In method?");
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    // Получение имён класса и метода вызвавшего данный log.
    public static void log(String text) {

        // Получение stack trace явным вызовом экземпляра класса.
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];

        // Получение имён класса и метода.
        String className = element.getClassName();
        String methodName = element.getMethodName();

        // Формирование строки вывода.
        String message = className + ": " + methodName + ": " + text;
        System.out.println(message);
    }
}
