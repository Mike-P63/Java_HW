// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

import java.util.Scanner;
public class HW_1 {
        public static void main(String[] args) {
            System.out.print("Введите число n: ");
            Scanner num = new Scanner(System.in);
            int n = num.nextInt();
            int sum = 0;
            int product_of_num = 1;
            for (int i = 1; i <= n; i++) {
                sum += i;
                product_of_num *= i;
            }
            System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
            System.out.printf("Произведение чисел (n!) от 1 до %d: %d%n ", n, product_of_num);
            num.close();
        }
}

