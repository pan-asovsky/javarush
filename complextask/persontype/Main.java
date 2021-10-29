package javarush.complextask.persontype;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        while (true) {
            key = reader.readLine();
            boolean isRightInput = key.equals("user") ||
                    key.equals("loser") || key.equals("coder") ||
                    key.equals("proger");
            if (!isRightInput) break;

            switch (key) {
                case "user" -> person = new Person.User();
                case "loser" -> person = new Person .Loser();
                case "coder" -> person = new Person.Coder();
                case "proger" -> person = new Person.Proger();
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {

        if (person instanceof Person.User user) {
            user.live();
        } else if (person instanceof Person.Loser loser) {
            loser.doNothing();
        } else if (person instanceof Person.Coder coder) {
            coder.writeCode();
        } else if (person instanceof Person.Proger proger) {
            proger.enjoy();
        }
    }
}
