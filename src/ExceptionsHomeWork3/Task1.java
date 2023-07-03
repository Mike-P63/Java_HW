package ExceptionsHomeWork3;

import java.io.FileWriter;
import java.util.Scanner;

// Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
//Фамилия Имя Отчество номертелефона
//
//Форматы данных:
//фамилия, имя, отчество - строки
//номертелефона - целое беззнаковое число без форматирования
//
//Ввод всех элементов через пробел
//
//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
// вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
// чем требуется.
//
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
// Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
// пользователю выведено сообщение с информацией, что именно неверно.
//
//Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
// в него в одну строку должны записаться полученные данные, вида
//
//<Фамилия><Имя><Отчество><номер_телефона>
//
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//
//Не забудьте закрыть соединение с файлом.
//
//При возникновении проблемы с чтением-записью в файл, исключение должно
// быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
public class Task1 {
    private String firstName;
    private String lastName;
    private String middleName;
    private String yearOfBirth;
    private long numberPhone;
    private final Scanner scan = new Scanner(System.in);

    private void EnterFirstName() {
        System.out.println("Введите имя: ");
        firstName = scan.nextLine();
        if (firstName.equals("")) {
            throw new RuntimeException("Значение не должно быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterLastName() {
        System.out.println("Введите фамилию: ");
        lastName = scan.nextLine();
        if (lastName.equals("")) {
            throw new RuntimeException("Значение не должно быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterMiddleName() {
        System.out.println("Введите отчество: ");
        middleName = scan.nextLine();
        if (middleName.equals("")) {
            throw new RuntimeException("Значение не должно быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterYearOfBirth() {
        System.out.println("Введите год рождения: ");
        yearOfBirth = scan.nextLine();
        if (yearOfBirth.equals("")) {
            throw new RuntimeException("Значение не должно быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterNumberPhone() {
        try {
            System.out.println("Введите номер телефона: ");
            String number = scan.nextLine();
            if (number.equals("")) {
                throw new RuntimeException("Значение не должно быть пустым,\nпопробуйте снова!");
            }
            numberPhone = Long.parseLong(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Не верный формат, попробуйте снова!");
        }
    }


    private void OutPutData() {
        System.out.println("\nFirst name \t- \t" + firstName + "\n" + "Last name \t- \t" + lastName + "\n" + "Middle name \t- \t" + middleName + "\n" + "Year of birth \t- \t" + yearOfBirth + "\n" + "Number phone \t- \t" + numberPhone + "\n");
    }

    private void DataEnter() {
        EnterFirstName();
        EnterLastName();
        EnterMiddleName();
        EnterYearOfBirth();
        EnterNumberPhone();
        OutPutData();
    }

    public void SaveDataEnter() {

        DataEnter();
        String file = "data/" + lastName + ".txt";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("<" + firstName + "> " + "<" + lastName + "> " + "<" + middleName + "> " + "<" + yearOfBirth + "> " + "<" + numberPhone + "> \n");
        } catch (Exception e) {
            System.out.println("Чтото пошло не так!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

}

