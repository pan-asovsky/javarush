package javarush.complextask.abstractfactory.helicopters;

public class Ka52Helicopter extends Helicopter {

    private final String model = "Ка-52";
    private final int maxSpeed = 350;
    private final int maxWeight = 10800;
    private final String countryOfOrigin = "Russia";

    public Ka52Helicopter() {}

    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return String.format("""
                Страна производитель: %s
                Модель: %s
                Максимальная скорость: %s
                Максимальная грузоподъёмность: %s""", countryOfOrigin, model, maxSpeed, maxWeight);
    }
}