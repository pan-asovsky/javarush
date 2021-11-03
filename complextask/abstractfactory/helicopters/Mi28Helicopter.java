package javarush.complextask.abstractfactory.helicopters;

public class Mi28Helicopter extends Helicopter {

    private final String model = "Ми-28";
    private final int maxSpeed = 300;
    private final int maxWeight = 12100;
    private final String countryOfOrigin = "Russia";

    public Mi28Helicopter() {}

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