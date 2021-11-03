package javarush.complextask.abstractfactory;
import javarush.complextask.abstractfactory.helicopters.*;

public class PassengerHelicopterFactory extends HelicopterFactory {

    @Override
    public void assembleBody() {
        System.out.println("  * Сборка облегчённого корпуса.");
    }

    @Override
    public void assembleBlade() {
        System.out.println("  * Сборка обычных лопастей.");
    }

    @Override
    public void assembleEngine() {
        System.out.println("  * Сборка серийного двигателя.");
    }

    public void assemblyInterior() {
        System.out.println("  * Сборка пассажирского салона.");
    }

    @Override
    public void assembleFinally() {

        System.out.println("Начало сборки: ");
        assembleBody();
        assembleBlade();
        assembleEngine();
        assemblyInterior();
        System.out.println("Сборка пассажирского вертолёта закончена!\n");
    }

    /***
     *
     * @param model - параметр передаётся из HelicopterFactory, определяет модель будущего вертолёта.
     * @return возвращает новый объект вертолёта в HelicopterFactory.
     */
    public static Helicopter assembleHelicopter(Helicopters model) {

        PassengerHelicopterFactory passengerHelicopterFactory = new PassengerHelicopterFactory();
        Helicopter helicopter = null;

        switch (model) {
            case AGUSTA -> {
                passengerHelicopterFactory.assembleFinally();
                helicopter = new AgustaA109Helicopter();
                System.out.println(helicopter);
            }
            case DYNALI -> {
                passengerHelicopterFactory.assembleFinally();
                helicopter = new DynaliH2SHelicopter();
                System.out.println(helicopter);
            }
            case KA32 -> {
                passengerHelicopterFactory.assembleFinally();
                helicopter = new Ka32Helicopter();
                System.out.println(helicopter);
            }
            case WESTLANDWESSEX -> {
                passengerHelicopterFactory.assembleFinally();
                helicopter = new WestlandWessexHelicopter();
                System.out.println(helicopter);
            }
        }
        return helicopter;
    }
}