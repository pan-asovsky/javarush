package javarush;

/*
Обновление путей
*/

public class ReplacePath {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.9/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {

        // Получение индекса первой встречи "jdk".
        // Получение индекса первого слэша после "jdk".
        // Создание подстроки oldJdk на основе индексов.
        int firstIndex = path.indexOf("jdk");
        int secondIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, secondIndex);

        // Возврат значения с проведением замены.
        return path.replace(oldJdk, jdk);
    }
}
