
//*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.


public class h1_4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String q = equation.replace("?", Integer.toString(i));
                q = q.replace("?", Integer.toString(j));
                String[] parts = q.split("\\+");
                int num1 = Integer.parseInt(parts[0].trim());
                int num2 = Integer.parseInt(parts[1].replace("=", "").trim());
                if (num1 + num2 == 69) {
                    System.out.println(q + " = 69");
                    return;
                }
            }
        }

        System.out.println("Решение не найдено");
    }
    
}
