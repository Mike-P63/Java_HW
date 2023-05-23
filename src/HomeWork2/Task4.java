package HomeWork2;
//4. Не обязательное. К калькулятору из предыдущего ДЗ добавить логирование.

import ClassWork2.Log;
import ClassWork2.Task2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4 {
    private static Logger logger = Log.log(Task4.class.getName()); // get.Name - если нужно будет произвести перенаименование
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Введите первое число: ");
        int number_1 = scanner.nextInt();
        logger.log(Level.INFO, "Введите второе число: ");
        int number_2 = scanner.nextInt();
        logger.log(Level.INFO, "Введите знак операции + - * / :");
        char option;
        option = scanner.next().charAt(0);// метод возвращает символ, расположенный по указанному индексу строки
        int result;
        if (option == '+') {
            logger.log(Level.INFO, number_1 + "+" + number_2 + " = " + (number_1 + number_2));
            //System.out.println(number_1 + "+" + number_2 + " = " + (number_1 + number_2));
        } else if (option == '-') {
            logger.log(Level.INFO, number_1 + "-" + number_2 + " = " + (number_1 - number_2));
            //System.out.println(number_1 + "-" + number_2 + " = " + (number_1 - number_2));
        } else if (option == '*') {
            logger.log(Level.INFO, number_1 + "*" + number_2 + " = " + (number_1 * number_2));
            //System.out.println(number_1 + "*" + number_2 + " = " + (number_1 * number_2));
        } else if (option == '/') {
            logger.log(Level.INFO, number_1 + "/" + number_2 + " = " + (number_1 / number_2));
            //System.out.println(number_1 + "/" + number_2 + " = " + (number_1 / number_2));
        }  else {
            logger.log(Level.INFO, "Неправильно введен знак действия!");
            //System.err.println("Неправильно введен знак действия!");
        }

    }
}
