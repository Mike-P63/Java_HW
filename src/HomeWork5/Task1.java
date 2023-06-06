package HomeWork5;
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать
// как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.

import java.util.*;

public class Task1 {

    public static final Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        fill();
        //compare();
    }
    private static void fill() {

        addData("Cергей Петров", 927345678, phoneBook);
        addData("Константин Иванов", 92734768, phoneBook);
        addData("Константин Иванов", 911567893, phoneBook);
        addData("Иван Кузнецов", 911560789, phoneBook);
        addData("Иван Кузнецов", 89560477, phoneBook);
        addData("Иван Кузнецов", 45622345, phoneBook);
        addData("Оксана Пушкарева", 330340587, phoneBook);
        addData("Оксана Пушкарева", 780778970, phoneBook);
        addData("Оксана Пушкарева", 456833457, phoneBook);
        addData("Оксана Пушкарева", 333344566, phoneBook);

        printBook(phoneBook);

    }

    public static void addData(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static int sort(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
           if (o1.getValue().size() > o2.getValue().size()) return -1;
           else if (o1.getValue().size() < o2.getValue().size()) return 1;
           else return 0;

    }

}
