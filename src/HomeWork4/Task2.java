package HomeWork4;

import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task2 {

    public static void enqueue(LinkedList<Integer> list, int num) {// помещает элемент в конец очереди
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) { // возвращает первый элемент из очереди и удаляет его
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double n = (Math.random() * 99);
        int num = (int) n;
        return num;
    }
}