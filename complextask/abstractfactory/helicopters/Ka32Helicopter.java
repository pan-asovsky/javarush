package javarush.complextask.abstractfactory.helicopters;

public class Ka32Helicopter extends Helicopter {

    private final String model = "Ка-32";
    private final int maxSpeed = 260;
    private final int maxWeight = 11000;
    private final String countryOfOrigin = "Russia";

    public Ka32Helicopter() {}

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