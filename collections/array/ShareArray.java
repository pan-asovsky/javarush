package javarush.collections.array;
import java.util.Arrays;

/*
Делим массив
*/

public class ShareArray {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

        int[] temporaryMassiveOne;
        int[] temporaryMassiveTwo;

        // Если длина массива чётная, то он копируется пополам на два подмассива.
        // Ежели наоборот - большая часть копируется в первый подмассив.
        if (array.length % 2 == 0) {
            temporaryMassiveOne = Arrays.copyOfRange(array, 0, array.length / 2);
            temporaryMassiveTwo = Arrays.copyOfRange(array, array.length / 2, array.length);
        } else {
            temporaryMassiveOne = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
            temporaryMassiveTwo = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
        }

        // Заполнение двумерного массива подмассивами.
        result[0] = Arrays.copyOf(temporaryMassiveOne, temporaryMassiveOne.length);
        result[1] = Arrays.copyOf(temporaryMassiveTwo, temporaryMassiveTwo.length);
        System.out.println(Arrays.deepToString(result));
    }
}
