package javarush.chickenfactory;

public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return (int) (Math.random() * 75);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format
                (" Моя страна %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
