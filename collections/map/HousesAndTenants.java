package javarush.collections.map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Города и жители.
*/

public class HousesAndTenants {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> tenants = new HashMap<>();

        // Считывает строку с консоли, пока не будет введена пустая строка.
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            // Добавляет введённые строки в HashMap tenants.
            tenants.put(city, family);
        }

        // Считывает строку города и по ней находит жильцов.
        String city = reader.readLine();
        if (tenants.containsKey(city)) {
            System.out.println(tenants.get(city));
        }
    }
}

