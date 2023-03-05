
import java.io.FileWriter;
import java.io.IOException;

public class program4 {
    //Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args){
        generateString();
        writeStringToFile("file.txt");

    }
    public static String generateString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        return sb.toString();
    }
    

    public static void writeStringToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(generateString());
            writer.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
