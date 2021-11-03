package javarush.complextask.abstractfactory.helicopters;

public class EurocopterTigerHelicopter extends Helicopter {

    private final String model = "Eurocopter Tiger";
    private final int maxSpeed = 322;
    private final int maxWeight = 6000;
    private final String countryOfOrigin = "France / Germany";

    public EurocopterTigerHelicopter() {}

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