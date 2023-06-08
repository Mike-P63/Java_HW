package HomeWork6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//Создать множество ноутбуков (Set).
//Написать метод, который будет запрашивать у пользователя критерий
// (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map или в Сет. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - цвет
//2 - бренд

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Task1 {
    public static void main(String[] args) {
        NoteBook comp1 = new NoteBook("Asus"," A543MA-DM1368",  "white");
        NoteBook comp2 = new NoteBook("Acer", "Asp A315-23",  "black");
        NoteBook comp3 = new NoteBook("Lenovo", "MD 7 15IML05",  "red");
        NoteBook comp4 = new NoteBook("MSI", "Mod 2 B11-002RU",  "black");
        NoteBook comp5 = new NoteBook("Asus", "DivoBook 4 ",  "green");
        NoteBook comp6 = new NoteBook("MSI", " E13  A12MT-061RU",  "green");
        NoteBook comp7 = new NoteBook("Huawei", "MateBook F-X",  "red");
        NoteBook comp8 = new NoteBook("Asus", " G14 4045",  "black");
        NoteBook comp9 = new NoteBook("MSI", "Waider GE78 ",  "white");
        NoteBook comp10 = new NoteBook("Apple", "MacBook Air",  "red");

        HashSet<NoteBook> notebooks = new HashSet<NoteBook>(
                Arrays.asList(comp1, comp2, comp3, comp4, comp5, comp6, comp7, comp8, comp9, comp10));

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.println();
        System.out.println("Добро пожаловать в интернет-магазин 'Все ноутбуки у нас!'\n" +
                "Здесь вы можете подобрать себе подходящий ноутбук\n");
        boolean filter = true;
        while (filter) {
            System.out.println(
                    "Выбрать по цвету, введите - 1\n"+
                    "Выбрать по бренду, введите - 2\n"+
                    "Посмотреть все модели, введите - 3\n" +
                    "Для выхода из каталога, введите - 0");

            String operation = sc.nextLine();
            switch (operation) {

                case "1":
                    filterColor(notebooks, sc);
                    break;
                case "2":
                    filterBrand(notebooks, sc);
                    break;
                case "3":
                    showCatalog(notebooks);
                    break;
                case "0":
                    System.out.println("До новых встреч!");
                    filter = false;
                    break;
                default:
                    System.out.println("Введена неправильная операция");
                    System.out.println();
                    break;
            }
        }

    }
     public static void filterBrand(HashSet<NoteBook> notebooks, Scanner scanner) {
        TreeSet<String> operSystems = new TreeSet<>();
        for (NoteBook note : notebooks) {
            operSystems.add(note.getBrand());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены бренды:"
                + operSystems.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий бренд: ");

        String oper = scanner.nextLine().toUpperCase();
        if (operSystems.contains(oper)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (NoteBook note : notebooks) {
                if (note.getBrand().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого бренда,попробуйте снова!");
            filterBrand(notebooks, scanner);

        }
    }
    public static void filterColor(HashSet<NoteBook> notebooks, Scanner scanner){
        TreeSet<String> colors = new TreeSet<>();
        for (NoteBook note: notebooks){
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий цвет: ");

        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (NoteBook note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого цвета. Попробуйте снова");
            filterColor(notebooks, scanner);
        }
    }

    public static void showCatalog(HashSet<NoteBook> notebooks){
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (NoteBook note : notebooks) {
            note.showInfo();
        }
    }
}

