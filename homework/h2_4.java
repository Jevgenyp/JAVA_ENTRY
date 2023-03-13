// К калькулятору из предыдущего дз добавить логирование.
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;
import java.io.IOException;

public class h2_4 {

    private static final Logger logger = Logger.getLogger(h2_4.class.getName());

    public static void main(String[] args) throws IOException {
        // Load the logging configuration from file
        System.setProperty("java.util.logging.config.file", "logging.properties");

        // Create a FileHandler to log messages to the file
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        Scanner scanner = new Scanner(System.in);

        logger.info("Введите первое число:");
        double number1 = scanner.nextDouble();

        logger.info("Введите второе число:");
        double number2 = scanner.nextDouble();

        logger.info("Введите символ операции (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        if (operation == '*') {
            double result = number1 * number2;
            logger.info(number1 + " * " + number2 + " = " + result);
            System.out.println(number1 + " * " + number2 + " = " + result);

        } 
        else if (operation == '/') {
            double result = number1 / number2;
            logger.info(number1 + " / " + number2 + " = " + result);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }

        else if (operation == '+') {
            double result = number1 + number2;
            logger.info(number1 + " + " + number2 + " = " + result);
            System.out.println(number1 + " + " + number2 + " = " + result);
        } 
        else if (operation == '-') {
            double result = number1 - number2;
            logger.info(number1 + " - " + number2 + " = " + result);
            System.out.println(number1 + " - " + number2 + " = " + result);
        } 
        else {
            logger.severe("Неверный символ операции: " + operation);
            System.out.println("Неверный символ операции");
            main(args);
        }
    }
}
