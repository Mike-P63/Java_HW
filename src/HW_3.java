// Реализовать простой калькулятор;

import java.util.Scanner;
public class HW_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number_1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number_2 = scanner.nextInt();
        System.out.print("Введите знак операции + - * / :");
        char option;
        option = scanner.next().charAt(0);// метод возвращает символ, расположенный по указанному индексу строки
        int result;
        switch(option){
            case '+':
                result = number_1 + number_2;
                System.out.printf("Резултьтат сложения равен: %d", result);
                break;
            case '-':
                result = number_1 - number_2;
                System.out.printf("Резултьтат вычитания равен: %d", result);
                break;
            case '*':
                result = number_1 * number_2;
                System.out.printf("Резултьтат умножения равен: %d", result);
                break;
            case '/':
                result = number_1 / number_2;
                System.out.printf("Резултьтат деления равен: %d", result);
                break;
        }
    }
}
