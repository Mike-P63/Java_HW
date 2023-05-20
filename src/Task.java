import java.util.Scanner;
import java.time.LocalTime;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String Name = in.next();
        String DTIME;
        int Hour = LocalTime.now().getHour();
        if (Hour == 23 || Hour < 5)
            DTIME = "Доброй ночи";
        else if (Hour < 12)
            DTIME = "Доброе утро";
        else if (Hour < 18)
            DTIME = "Добрый день";
        else
            DTIME = "Добрый вечер";
        System.out.println(Name);
        System.out.println(DTIME + ", " + Name + "!");
        in.close();
    }

}