//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//Ответ: результат - a4b3cd2 для примера
public class programm2 {
    public static void main(String[] args) {
        String fff = "aaaabbbcdd";
        String aaa = compressString(fff);
        System.out.println(aaa);
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
    
        for (int i = 0; i < str.length(); i++) {
            count++;
    
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 0;
            }
        }
    
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    
}
