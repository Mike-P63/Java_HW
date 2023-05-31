package HomeWork4;

//import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

//public class Task1 {
//        public static void main(String[] args) {
//            LinkedList<Integer> list = new LinkedList<>();
//            int arr[] = { 1, 3, 8, 11, 23, 34, 65, 78, 90 };
//            for (int i : arr)
//                list.add(i);
//            System.out.println("Исходный список: " + list);
//            LinkedList<Integer> reverseList = new LinkedList<>();
//            reverse(list, reverseList);
//            System.out.println("Перевернутый список: " + reverseList);
//        }
//    public static LinkedList<Integer> reverse(LinkedList<Integer> list, LinkedList<Integer> newList) {
//        for (int i = 0; i < list.size(); i++) {
//            newList.add(list.peekLast());
//            list.removeLast();
//            i--;
//        }
//        return newList;
//    }
//}


// Второй способ:

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = createList(10);
        System.out.println("Cозданный список:    " + ll);
        System.out.println("Перевернутый список: " + reverseList(ll));
    }

    static LinkedList<Integer> createList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i + 1);
        }
        return linkedList;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newList = new LinkedList<>();
        while (linkedList.size() > 0) {
            newList.add(linkedList.pollLast());
        }
        return newList;
    }
}