package ExceptionsHomeWork2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String inputText = null;
        while (!valid) {
            System.out.println("Введите текст не менее одного знака! : \t");
            try {
                inputText = scanner.nextLine();
                if (inputText.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Неверный ввод!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        }
        System.out.println("Вы ввели следующий текст: " + inputText);
    }
}
