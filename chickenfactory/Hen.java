package javarush.chickenfactory;

abstract class Hen {

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}
