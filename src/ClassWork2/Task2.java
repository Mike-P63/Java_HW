package ClassWork2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения
public class Task2 {
    private static Logger logger = Log.log(Task2.class.getName());
    public void write (String string){
        String str = createStr(string);
        System.out.println("Длина строки = " + str.length());
        try(FileWriter in = new FileWriter("test.txt")) {
            in.write(str);
            //System.out.println("Записано");
            logger.log(Level.INFO, "Записано");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String createStr(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++){
            stringBuilder.append(str);
        }
 //stringBuilder.append(String.valueOf(str).repeat(100));
        return stringBuilder.toString();
    }
}
