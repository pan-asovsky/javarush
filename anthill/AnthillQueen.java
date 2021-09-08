package javarush.anthill;

public class AnthillQueen {

    public static AnthillWorker[] AnthillWorkers;
    public static AnthillSoldier[] AnthillSoldiers;

    public static void main(String[] args) {
        populate();

        for (int i = 0; i < AnthillWorkers.length; i++) {
            AnthillWorker worker = AnthillWorkers[i];
            System.out.print("Рабочий " + (i + 1) + ": ");
            worker.sendForFood();
        }

        for (int i = 0; i < AnthillSoldiers.length; i++) {
            AnthillSoldier soldier = AnthillSoldiers[i];
            System.out.print("Солдат " + (i + 1) + ": ");
            soldier.sendIntoBattle();
        }
    }

    public static void populate() {
        AnthillWorkers = new AnthillWorker[12];
        for (int i = 0; i < AnthillWorkers.length; i++) {
            AnthillWorkers[i] = new AnthillWorker();
        }

        AnthillSoldiers = new AnthillSoldier[3];
        for (int i = 0; i < AnthillSoldiers.length; i++) {
            AnthillSoldiers[i] = new AnthillSoldier();
        }
    }
}
