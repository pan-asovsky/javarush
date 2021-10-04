package javarush.collections.map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Удалить всех людей, родившихся летом
*/

public class RemoveSummerPeople {

    public static Map<String, Date> createMap() throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Шварцнеггер", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне", dateFormat.parse("FEBRUARY 2 2012"));
        map.put("Долмацкий", dateFormat.parse("MARCH 3 2012"));
        map.put("Моргенштерн", dateFormat.parse("APRIL 4 2012"));
        map.put("Грудинин", dateFormat.parse("MAY 5 2012"));
        map.put("Циолковский", dateFormat.parse("JUNE 6 2012"));
        map.put("Моцарт", dateFormat.parse("JUNE 7 2012"));
        map.put("Дизель", dateFormat.parse("AUGUST 8 2012"));
        map.put("Чан", dateFormat.parse("SEPTEMBER 9 2012"));
        map.put("Вуд", dateFormat.parse("OCTOBER 10 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        // Цикл получает ключ, далее переменная date типа Date по
        // ключу получает значения. Переменной month присваивается
        // индекс месяца + 1, так как индексация начинается с нуля.
        // Далее проверяются значения, и удаляются входящие во временной
        // диапазон летних месяцев.
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }


    }

    public static void main(String[] args) {

    }
}

