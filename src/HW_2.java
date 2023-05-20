// Вывести все простые числа от 1 до 1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        List numbers = new ArrayList(); // Объявляем динамический списочный массив
        for (int i = 2; i <= n; i++) {
            boolean isNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                     isNumber = false;
                     break;
                 }
             }
             if (isNumber) {
                 numbers.add(i); // применяем функцию add для добавления элементов в списочный массив
             }
         }
         System.out.println("Простые числа: " + numbers);
     }
}


