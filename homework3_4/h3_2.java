import java.util.ArrayList;


//Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class h3_2 {
    public static void main (String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        } 
    
    System.out.println(removeEvenNumbers(nums));

    }
    
    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        for (int num : nums) {
            if (num % 2 != 0) {
                newNums.add(num);
            }
        }
        return newNums;
    }
}
