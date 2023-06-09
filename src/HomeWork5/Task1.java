package HomeWork5;
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать
// как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.


//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//К сожалению, запись семинара так и не появилась на платформе. Хотел пересмотреть ее и понять,
// как применить компаратор, про который Вы подробно рассказывали на семинаре. Получился только
// вывод контактов телефонной книги.
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        fill();
        //sort();
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

}
