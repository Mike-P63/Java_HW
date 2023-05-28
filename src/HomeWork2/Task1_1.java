package HomeWork2;

public class Task1_1 {

    public static void main(String[] args) {
        String json = "[" +
                "{\"Фамилия\"" +
                ":\"Иванов\"," +
                "\"Оценка\":\"5\"," +
                "\"Предмет\":\"Математика\"}" +
                "," +
                "{\"Фамилия\"" +
                ":\"Петрова\"," +
                "\"Оценка\":\"4\"," +
                "\"Предмет\":\"Физика\"}," +
                "," +
                "{\"Фамилия\"" +
                ":\"Щеглов\"," +
                "\"Оценка\":\"3\"," +
                "\"Предмет\":\"История\"}" +
                "]";

        parseStringWithSimpleJson(json);
    }

    private static void parseStringWithSimpleJson(String json) {
        StringBuilder builder = new StringBuilder();
        String[] parts = json.split(",");
        for (String s : parts) {
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("Фамилия")) {
                builder.append("Студент ")
                        .append(s.replaceAll("[\"}\\[\\]]", "")
                                .split(":")[1]);
            }
            if (s.split(":")[0].replaceAll("[\"{}\\[\\]]", "").equals("Оценка")) {
                builder.append("Получил(а) ")
                        .append(s.split(":")[1]
                                        .replaceAll("[\"}\\[\\]]", ""));
            }
            if (s.split(":")[0].replaceAll("[\"{}\\[\\]]", "").equals("Предмет")) {
                builder.append("По предмету ")
                        .append(s.split(":")[1]
                                .replaceAll("[\"{}\\[\\]]", "")).append(".\n");
            }

        }
        System.out.println(builder);
    }

}