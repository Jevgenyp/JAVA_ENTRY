//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.FileWriter;
import java.util.Arrays;

public class h2_2 {
    public static void main(String[] args) throws Exception {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        FileWriter writer = new FileWriter("log.txt");

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // Запись текущего состояния массива в лог-файл
            writer.write("Iteration " + (i+1) + ": " + Arrays.toString(arr) + "\n");
        }
        
        writer.close();
    }
}
