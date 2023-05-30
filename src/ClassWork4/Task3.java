package ClassWork4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была
// первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task3 {
    //private static Stack<String> stack = new Stack<>();
    private static Deque<String> stack = new ArrayDeque<>();

    private static String getString() {
        System.out.println("Введитестроку: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
    private static void save(String in) {
        stack.push(in);
    }
    private static void run(String in) {
        if (in.equalsIgnoreCase("g")) System.exit(0);
        else if (in.equalsIgnoreCase("print")) {
            print();
        } else if (in.equalsIgnoreCase("revert")) {
            revert();
        } else {
            save(in);
        }
    }
    private static void revert() {
        stack.pop();
        System.out.println(stack);
    }
    private static void print() {
        System.out.println(stack);
    }
    public static void main(String[] args) {
        while (true) {
            String in = getString();
            run(in);
        }

    }
}
