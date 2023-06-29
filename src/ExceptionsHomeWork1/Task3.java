package ExceptionsHomeWork1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {8, 12, 9, 2, 7};
        int[] array2 = {6, 4, 0, 8, 5};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длинна массивов различна!");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя!");
            }
            array[i] = array1[i] / array2[i];
        }
        return array;
    }
}
