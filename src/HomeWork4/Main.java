package HomeWork4;

import java.util.LinkedList;

import static HomeWork4.Task2.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, getRandomNumber());
        }
        System.out.println(list);

        System.out.println(dequeue(list)); // удаляем первый элемент
        System.out.println(list);

        System.out.println(first(list)); // выводим первый элемент
        System.out.println(list);
    }
}
