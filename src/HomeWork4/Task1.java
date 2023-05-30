package HomeWork4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
public class Task1 {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            int arr[] = { 1, 3, 8, 11, 23, 34, 65, 78, 90 };
            for (int i : arr)
                list.add(i);
            System.out.println("Исходный список: " + list);
            LinkedList<Integer> reverseList = new LinkedList<>();
            reverse(list, reverseList);
            System.out.println("Перевернутый список: " + reverseList);
        }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list, LinkedList<Integer> newList) {
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.peekLast());
            list.removeLast();
            i--;
        }
        return newList;
    }
}

