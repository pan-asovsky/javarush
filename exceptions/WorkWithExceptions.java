package javarush.exceptions;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;


public class WorkWithExceptions {

    // Перехват checked исключений. Checked исключения - наследники класса CheckedException.
    public static class CheckedExceptions {

        // Создание экземляра класса для обращения к нестатическим методам.
        public static void main(String[] args) {
            handleExceptions(new CheckedExceptions());
        }

        public static void handleExceptions(CheckedExceptions obj) {

            // В блок try оборачивается вызов трёх методов, которые могут бросить исключения.
            // В блоке catch они перехватываются родительским классом Exception.
            try {
                obj.method1();
                obj.method2();
                obj.method3();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Вызов исключения ключевым словом throw.
        public void method1() throws IOException {
            throw new IOException();
        }

        public void method2() throws NoSuchFieldException {
            throw new NoSuchFieldException();
        }

        public void method3() throws RemoteException {
            throw new RemoteException();
        }
    }

    //_________________________________________________________________________\\

    // Перехват Unchecked исключений. К ним относятся наследники RuntimeException.
    public static class UncheckedExceptions {

        // Создание экземляра класса для обращения к нестатическим методам.
        public static void main(String[] args) {
            handleExceptions(new UncheckedExceptions());
        }

        public static void handleExceptions(UncheckedExceptions obj) {

            // В блок try оборачивается вызов трёх методов, которые могут бросить исключения.
            // В блоке catch они перехватываются родительским классом RuntimeException.
            try {
                obj.method1();
                obj.method2();
                obj.method3();
            } catch (RuntimeException e) {
                printStack(e);
            }
        }

        // Выводит в консоль stack trace полученного исключения.
        public static void printStack(Throwable throwable) {

            System.out.println(throwable);
            for (StackTraceElement element : throwable.getStackTrace()) {
                System.out.println(element);
            }
        }

        public void method1() {
            throw new NullPointerException();
        }

        public void method2() {
            throw new IndexOutOfBoundsException();
        }

        public void method3() {
            throw new NumberFormatException();
        }
    }

    //_________________________________________________________________________\\

    // Выборочный перехват исключений.
    public static class SelectiveInterception {

        // Некий мистер StatelessBean, а именно Bean без состояния (stateless).
        public static StatelessBean BEAN = new StatelessBean();

        public static void main(String[] args) {

            // В блоке try вызываем метод, который может бросить исключение.
            // В блоке catch обрабатываем его, вызвав метод log мистера BEAN.
            try {
                handleExceptions();
            } catch (FileSystemException e) {
                BEAN.log(e);
            }
        }

        public static void handleExceptions() throws FileSystemException {

            // В блоке try вызывается метод, который может бросить исключение.

            // В первом блоке catch перехватывается FileSystemException, логируется
            // и пробрасывается дальше с помощью ключевого слова throw.

            // Во втором блоке catch исключение IOException перехватывается и логируется.
            try {
                BEAN.methodThrowExceptions();
            } catch (FileSystemException e) {
                BEAN.log(e);
                throw e;
            } catch (IOException e) {
                BEAN.log(e);
            }
        }


        public static class StatelessBean {

            public int i = (int) (Math.random() * 3);

            // Вывод в консоль информации об исключении: сообщение, класс и название.
            public void log(Exception exception) {
                System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
            }

            // methodThrowExceptions бросает исключение в зависимости
            // от полученного значения переменной i.
            public void methodThrowExceptions() throws IOException {

                switch (i) {
                    case 1 -> throw new CharConversionException();
                    case 2 -> throw new FileSystemException("");
                    case 3 -> throw new IOException();
                }
            }
        }
    }
}
