//1. Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.

//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package HomeWork2;
import java.util.LinkedHashMap;
import java.util.Map;
public class Task1 {
    public static void main(String[] args) {
    Map<String, String> map = new LinkedHashMap<>(); // структура данных, содержащая набор пар “ключ-значение”
    map.put("name","Ivanov");
    map.put("country","Russia");
    map.put("city","Moscow");
    map.put("age",null);

    System.out.println(getRequest(map));
}
    public static String getRequest(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());// убираем лишнее 'and' в конце фразы

        return result.toString();
    }
}
