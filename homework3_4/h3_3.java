
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


public class h3_3 {
    public static void main (String[] args){
        int[] arr = arrayFiller(10, 100);
        printArray(arr);
        int min = arr[0], max = arr[0], sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
        
        

       
        } 
    
    public static int[] arrayFillerPosNeg(int length, int maxNumber){ // Метод заполняет массив отрицательные и положительные числа
        
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxNumber * 2) - maxNumber;
        }
        return arr;
    }
    
    public static int[] arrayFiller(int length, int maxNumber){// Метод заполняет массив положительные числа.
        
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxNumber);
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

