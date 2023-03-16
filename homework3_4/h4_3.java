//В калькулятор добавьте возможность отменить последнюю операцию.

   
// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.Stack;

public class h4_3 {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<Double> stack = new Stack<>();
    private static double lastResult = 0.0;

    public static void main(String[] args) {
        while (true) {
            
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /) или введите u чтобы удалить предведущую операцию: ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    lastResult = num1 + num2;
                    stack.push(lastResult);
                    break;
                case '-':
                    lastResult = num1 - num2;
                    stack.push(lastResult);
                    break;
                case '*':
                    lastResult = num1 * num2;
                    stack.push(lastResult);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Деление на ноль невозможно!");
                        continue;
                    }
                    lastResult = num1 / num2;
                    stack.push(lastResult);
                    break;
                case 'u':
                    if (stack.empty()) {
                        System.out.println("Стек пуст, невозможно выполнить операцию!");
                        continue;
                    }
                    stack.pop();
                    if (stack.empty()) {
                        System.out.println("Стек пуст!");
                        continue;
                    }
                    lastResult = stack.peek();
                    break;
                default:
                    System.out.println("Неверный символ операции!");
                    continue;
            }

            System.out.println("Результат: " + lastResult);
        }
    }
}


