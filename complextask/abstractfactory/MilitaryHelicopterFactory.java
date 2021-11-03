package javarush.complextask.abstractfactory;
import javarush.complextask.abstractfactory.helicopters.*;

public class MilitaryHelicopterFactory extends HelicopterFactory {

    @Override
    public void assembleBody() {
        System.out.println("  * Сборка бронированного корпуса.");
    }

    @Override
    public void assembleBlade() {
        System.out.println("  * Сборка усиленных лопастей.");
    }

    @Override
    public void assembleEngine() {
        System.out.println("  * Сборка турбированного двигателя.");
    }

    public void assembleGun() {
        System.out.println("  * Сборка бортового вооружения.");
    }

    @Override
    public void assembleFinally() {

        System.out.println("Начало сборки: ");
        assembleBody();
        assembleBlade();
        assembleEngine();
        assembleGun();
        System.out.println("Сборка военного вертолёта закончена!\n");
    }

    /***
     *
     * @param model - параметр передаётся из HelicopterFactory, определяет модель будущего вертолёта.
     * @return возвращает новый объект вертолёта в HelicopterFactory.
     */
    public static Helicopter assembleHelicopter(Helicopters model) {

        MilitaryHelicopterFactory militaryHelicopterFactory = new MilitaryHelicopterFactory();
        Helicopter helicopter = null;

        switch (model) {
            case MI28 -> {
                militaryHelicopterFactory.assembleFinally();
                helicopter = new Mi28Helicopter();
                System.out.println(helicopter);
            }
            case KA52 -> {
                militaryHelicopterFactory.assembleFinally();
                helicopter = new Ka52Helicopter();
                System.out.println(helicopter);
            }
            case AH1 -> {
                militaryHelicopterFactory.assembleFinally();
                helicopter = new AH1Helicopter();
                System.out.println(helicopter);
            }
            case TIGER -> {
                militaryHelicopterFactory.assembleFinally();
                helicopter = new EurocopterTigerHelicopter();
                System.out.println(helicopter);
            }
        }
        return helicopter;
    }
}