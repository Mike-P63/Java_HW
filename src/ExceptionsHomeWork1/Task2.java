package ExceptionsHomeWork1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {7, 14, 22, 13, 2, 8};
        int[] array2 = {8, 23, 7, 9, 27, 4, 34 };
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Длинна массивов различна!");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}
