package javarush.map;

import java.util.HashMap;
import java.util.Map;

/*
Удалить людей, имеющих одинаковые имена
*/


public class DuplicateNames {

    // Создаём и возвращаем Map.
    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();
        map.put("Цветаев", "Фёдор");
        map.put("Соколов", "Иван");
        map.put("Чайкин", "Пётр");
        map.put("Петров", "Евгений");
        map.put("Васечкин", "Андрей");
        map.put("Суриков", "Фёдор");
        map.put("Ильин", "Константин");
        map.put("Самойлов", "Глеб");
        map.put("Растеряев", "Евгений");
        map.put("Яковлев", "Иван");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Map<String, String> copy = new HashMap<>(map);

        // Двойной цикл прохода сравнивает значения (value) переданной Map,
        // и значения Map copy. В случае встречи значения более одного раза,
        // значение (value) удаляется с помощью метода removeItemFromMapByValue().
        for (String name : copy.values()) {
            int count = 0;
            for (String names : map.values()) {
                if (names.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    // Сравнивает значения (value) Map с переданным значением value.
    // Удаляет дубликаты.
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
