package javarush.threads;

import java.util.Date;

/* 
Поговорим о музыке
*/

public class ViolinPlayingTime {

    public static final int DELAY = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Emmanuel"));
        violin.start();
    }

    /***
     * @param n - задержка в секундах.
     */
    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();
        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {

        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            Date dateStart = startPlaying();
            sleepNSeconds(1);
            Date dateStop = stopPlaying();
            System.out.println("Playing " + (dateStop.getTime() - dateStart.getTime()) + " ms");
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
    }
}
