package ExceptionsHomeWork1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {8, 12, 9, 2, 7};
        int[] array2 = {6, 4, 0, 8, 5};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинна массивов различна!");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}
