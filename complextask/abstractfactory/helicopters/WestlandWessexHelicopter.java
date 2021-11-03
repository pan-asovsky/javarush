package javarush.complextask.abstractfactory.helicopters;

public class WestlandWessexHelicopter extends Helicopter {

    private final String model = "Westland Wessex";
    private final int maxSpeed = 212;
    private final int maxWeight = 6123;
    private final String countryOfOrigin = "United Kingdom";

    public WestlandWessexHelicopter() {}

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