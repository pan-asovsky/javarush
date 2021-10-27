package javarush.complextask.chickenfactory;

public class HenFactory {

    static Hen getHen(String country) {

        return switch (country) {
            case Country.BELARUS -> new BelarusianHen();
            case Country.RUSSIA -> new RussianHen();
            case Country.UKRAINE -> new UkrainianHen();
            case Country.MOLDOVA -> new MoldovanHen();
            default -> null;
        };
    }
}