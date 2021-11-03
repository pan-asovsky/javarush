package javarush.complextask.abstractfactory;
import javarush.complextask.abstractfactory.helicopters.Helicopter;

public abstract class HelicopterFactory {

    abstract void assembleBody();
    abstract void assembleBlade();
    abstract void assembleEngine();

    public void assembleFinally() {

        assembleBody();
        assembleBlade();
        assembleEngine();
    }

    /***
     *
     * @param model - параметр передаётся напрямую из Main.main, определяет модель будущего вертолёта.
     * @return возвращает готовый вертолёт.
     *
     * Внутри метода определяется модель и на её основе сборка передаётся соответствующей фабрике.
     */
    public static Helicopter assembleHelicopter(Helicopters model) {

        Helicopter helicopter = null;

        if (model == null) {
            System.out.println("Неверный тип!");
        } else if (model == Helicopters.MI28 || model == Helicopters.KA52 ||
                model == Helicopters.AH1 || model == Helicopters.TIGER) {
            System.out.println("\n*************************************\n");
            helicopter = MilitaryHelicopterFactory.assembleHelicopter(model);
        } else if (model == Helicopters.AGUSTA || model == Helicopters.DYNALI ||
                model == Helicopters.KA32 || model == Helicopters.WESTLANDWESSEX) {
            System.out.println("\n*************************************\n");
            helicopter = PassengerHelicopterFactory.assembleHelicopter(model);
        }
        return helicopter;
    }
}