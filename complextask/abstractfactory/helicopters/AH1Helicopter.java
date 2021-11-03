package javarush.complextask.abstractfactory.helicopters;

public class AH1Helicopter extends Helicopter {

    private final String model = "Bell AH-1 Super Cobra";
    private final int maxSpeed = 352;
    private final int maxWeight = 6690;
    private final String countryOfOrigin = "United States of America";

    public AH1Helicopter() {}

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