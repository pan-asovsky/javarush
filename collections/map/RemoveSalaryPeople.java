package javarush.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
Налоговая и зарплаты
*/

public class RemoveSalaryPeople {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Щербаков", 1250);
        map.put("Титов", 785);
        map.put("Давыдов", 500);
        map.put("Барсуков", 350);
        map.put("Шишкин", 610);
        map.put("Ефимов", 490);
        map.put("Тихонов", 715);
        map.put("Савельев", 585);
        map.put("Кропоткин", 600);
        map.put("Серов", 240);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());

    }
}
