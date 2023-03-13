//(Для преподавателя: если не успели выполнить задание 7, дать наводку из этого задания) Дана json-строка (можно сохранить в файл и читать из файла)

//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

//Пример вывода:

//Студент Иванов получил 5 по предмету Математика.

//Студент Петрова получил 4 по предмету Информатика.

//Студент Краснов получил 5 по предмету Физика.

import java.io.*;
import org.json.*;

public class h2_3 {
    
    public static String parseJSONFromFile(String filename) {
        StringBuilder sb = new StringBuilder();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            StringBuilder jsonString = new StringBuilder();
            while (line != null) {
                jsonString.append(line);
                line = reader.readLine();
            }
            reader.close();
            
            JSONArray jsonArray = new JSONArray(jsonString.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String surname = jsonObject.getString("surname");
                int grade = jsonObject.getInt("grade");
                String subject = jsonObject.getString("subject");
                
                sb.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".\n");
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        
        return sb.toString();
    }
    
}


