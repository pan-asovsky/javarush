package javarush.collections.set;

import java.util.HashSet;
import java.util.Set;

/*
Множество всех животных
*/

public class SimpleSetOperation {

    public static void main(String[] args) {

        Set<Cat> cats = createCats(4);
        Set<Dog> dogs = createDogs(3);

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("_____");
        printPets(pets);
    }

    // Создаёт и возвращает множество объектов Cat.
    public static Set<Cat> createCats(int quantity) {

        Set<Cat> result = new HashSet<>();
        for (int i = 0; i < quantity; i++) {
            result.add(new Cat());
        }
        return result;
    }

    // Создаёт и возвращает множество объектов Dog.
    public static Set<Dog> createDogs(int quantity) {

        Set<Dog> result = new HashSet<>();
        for (int i = 0; i < quantity; i++) {
            result.add(new Dog());
        }
        return result;
    }

    // Объединяет множества объектов Cat и Dog.
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        Set<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    // Удаляет объекты Cat из множества pets.
    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    // Вывод в консоль множества pets.
    public static void printPets(Set<Object> pets) {

        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}

