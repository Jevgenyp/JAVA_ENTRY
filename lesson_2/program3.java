public class program3 {
    
    //Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
    public static boolean isPalindrome(String str) {
        // Убираем пробелы и приводим все символы к нижнему регистру
        String normalized = str.replaceAll("\\s", "").toLowerCase();

        // Сравниваем символы с конца и с начала строки
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - i - 1)) {
            // Если символы не совпадают, то строка не является палиндромом
                return false;
            }
        }

        // Если цикл завершился без возврата false, то строка является палиндромом
        return true;
    }
    public static void main(String[] args){
        String text = "осело колесо";
        System.out.println(isPalindrome(text));

    }
    
    
}
