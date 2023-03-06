

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class h1_1 {
    public static void main(String[] args) {
            int n = 5;
    
            // Вычисление n-ого треугольного числа
            int nthTriangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                nthTriangleNumber += i;
            }
            System.out.println("n-ое треугольное число: " + nthTriangleNumber);
    
            // Вычисление факториала числа n
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + n + ": " + factorial);
        }
}
    

