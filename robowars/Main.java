package javarush.robowars;

import javarush.util.UserInput;

public class Main {

    public static void main(String[] args) {

        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        int strikesCount = UserInput.readUserInt();
        for (int i = 0; i < strikesCount; i++) {
            System.out.print("Раунд " + (i + 1) + ": ");
            if (i % 2 == 0) {
                doMove(amigo, enemy);
            } else {
                doMove(enemy, amigo);
            }
        }
    }

    public static void doMove(Robot firstRobot, Robot secondRobot) {

        BodyPart attacked = firstRobot.attack();
        BodyPart defenced = firstRobot.defence();
        System.out.printf("%s атаковал робота %s, атакована %s, защищена %s%n",
                firstRobot.getName(), secondRobot.getName(), attacked, defenced);
    }
}
