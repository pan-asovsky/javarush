package javarush;

/*
Кошачья бойня.
*/

public class CatFight {

    public static void main(String[] args) {

        // Создаём котов.
        Cat tolik = new Cat("Толик", 1, 1000, 4);
        Cat garry = new Cat("Гарри", 1, 750, 3);
        Cat sharushka = new Cat("Шарушка", 2, 2500, 7);

        System.out.println(tolik.fight(garry));
        System.out.println(garry.fight(sharushka));
        System.out.println(sharushka.fight(tolik));
    }

    public static class Cat {

        // Поля класса.
        private String name;
        private int age;
        private int weight;
        private int strength;

        // Конструктор класса.
        public Cat(String name, int age, int weight, int strength) {

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {

            // Метод compare() класса Integer сравнивает значения аргументов.
            // Если первый аргумент больше, возвращатся 1.
            // Если первый аргумент меньше, возвращается -1.
            // В случае равенства аргументов возвращается 0.
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            // Подсчёт общих набранных очков. Возврат логического значения.
            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}
