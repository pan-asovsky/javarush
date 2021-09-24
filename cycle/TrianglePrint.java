package javarush.cycle;

public class TrianglePrint {

    public static void main(String[] args) {

        //вывод 8 треугольником с катетами по 10
        for (int m = 1; m <= 10; m++) {
            for (int j = 0; j < m; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
