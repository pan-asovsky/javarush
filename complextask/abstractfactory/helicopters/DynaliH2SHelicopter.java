package javarush.complextask.abstractfactory.helicopters;

public class DynaliH2SHelicopter extends Helicopter {

    private final String model = "Dynali H2S";
    private final int maxSpeed = 165;
    private final int maxWeight = 700;
    private final String countryOfOrigin = "Belgium";

    public DynaliH2SHelicopter() {}

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