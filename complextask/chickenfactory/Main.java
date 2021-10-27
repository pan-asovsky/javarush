package javarush.complextask.chickenfactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hen> hens = new ArrayList<>();

        Hen hen = HenFactory.getHen(Country.BELARUS);
        hens.add(hen);

        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        hens.add(hen1);

        Hen hen2 = HenFactory.getHen(Country.UKRAINE);
        hens.add(hen2);

        Hen hen3 = HenFactory.getHen(Country.MOLDOVA);
        hens.add(hen3);

        for (Hen chicken : hens) {
            System.out.println(chicken.getDescription());
        }
    }
}
