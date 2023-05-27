package HomeWork3;

import java.util.*;

// Пусть дан произвольный список целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
public class Task1 {
    static Random random = new Random();
    static LinkedList<Integer> ints = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(20));
        }
        Collections.sort(ints);
        System.out.println("Массив случайных чисел: " + ints);
        mixElement(ints);
        maxElement(ints);
        averageSumOfElements(ints);
        removeEvenNumbers(ints);
   }
    public static void removeEvenNumbers(LinkedList<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            int even = ints.get(i) % 2;
            if (even == 0) {
                ints.remove(i);
                i--;
            }
        }
        System.out.print("Массив без четных чисел: " + ints);
    }
    public static void mixElement(LinkedList<Integer> ints) {
        ints.sort(null);
        int min = ints.get(0);
        System.out.println("Минимальный элемент массива: " + min);
        }

    public static void maxElement(LinkedList<Integer> ints) {
        ints.sort(null);
        int max = ints.get(ints.size() - 1);
        System.out.println("Максимальный элемент массива: " + max);
    }
    public static void averageSumOfElements(LinkedList<Integer> ints) {
        float sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        float avg = sum/ints.size();
        System.out.println("Среднее арифметическое элементов массива: " + avg);
    }
}



