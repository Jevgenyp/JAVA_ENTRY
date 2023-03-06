import java.util.Scanner;

//Реализовать простой калькулятор

public class h1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите символ операции (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '*') {
            double result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        
        } 
        if (operation == '/') {
            double result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }

        if (operation == '+') {
            double result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        if (operation == '-') {
            double result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
        else {
            System.out.println("Неверный символ операции");
            main(args);
        }
    }
    
}
