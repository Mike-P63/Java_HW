package HomeWork2;
//3. Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//    Студент Иванов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Информатика.
//    Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileReader;
public class Task3 {
    public static void main(String[] args) {
        parseStringTxt();
    }
    public static void parseStringTxt() {
        String filename = "C:\\Users\\user\\IdeaProjects\\Java Start\\src\\HomeWork2\\db.txt";
        File file = new File(filename);
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : a) {
                stringBuilder.append(c);
            }
            String line = stringBuilder.toString();
            line = line.replace("фамилия", "Студент");
            line = line.replace("оценка", "получил(а)");
            line = line.replace("предмет", "по предмету");
            line = line.replace("\"", "");
            line = line.replace(":", " ");
            line = line.replace(",", " ");
            System.out.println(line);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
