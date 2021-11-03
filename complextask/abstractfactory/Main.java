package javarush.complextask.abstractfactory;

public class Main {

    public static void main(String[] args) {

        HelicopterFactory.assembleHelicopter(Helicopters.WESTLANDWESSEX);
        HelicopterFactory.assembleHelicopter(Helicopters.KA52);
        HelicopterFactory.assembleHelicopter(Helicopters.TIGER);
        HelicopterFactory.assembleHelicopter(Helicopters.AH1);
    }
}
