package javarush.threads;

public class StackTraceInMultithreading {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        System.out.println("*****************");
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {

            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
            }
        }
    }
}
