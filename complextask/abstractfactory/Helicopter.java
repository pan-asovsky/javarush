package javarush.complextask.abstractfactory;

public abstract class Helicopter {

    private String model;
    private int maxSpeed;
    private int maxWeight;

    public Helicopter(String model, int maxSpeed, int maxWeight) {

        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }



}
