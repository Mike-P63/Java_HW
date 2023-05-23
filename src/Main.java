import java.sql.SQLOutput;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Знакомство с языком Java
        System.out.println("Hello!!!");
        System.out.println("Hello\n\n\tWorld!!!");
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        /*
        Первые шаги
        */
        int age = 25;
        System.out.println(age);
        System.out.println("Мой возраст: " + age + ".");
        int a = 123;
        System.out.println(a++);
        System.out.println(a);
        a = --a - a--;
        System.out.println(a);
        boolean f = 123 <= 234;
        System.out.println(f);
        //int[]arr = new int[] {2,4,5,7,1,2,8,6,4};
        //System.out.println(arr[5]);


        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, "+ username);


        //Scanner scan = new Scanner(System.in);
        //System.out.print("int a: ");
        // flag = scan.hasNextInt();
        //System.out.println(flag);
        //int i = scan.nextInt();
        //System.out.println(i);

    }
}
/*
int[]arr = new int[] {1,1,0,1,1,1};

    void maxOfOnes(){
        int count = 0;
        int countNext = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == 1){
                countNext++;
            }else if (count < countNext) {
                    count = countNext;
                    countNext = 0;
                }
            }
            if (count < countNext){
                System.out.println(countNext);
            }else{
                System.out.println(count);
            }

 */



