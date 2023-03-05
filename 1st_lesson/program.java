/*
 * 
 *K
 O
 M
 E
 N
 T
 A
 R
 I
 J
 */
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
 public class program{
    public static void main(String[] args) throws IOException {//komentarij
        String s = "Кукук ";
        int m = 10;

        System.out.println(m);   
        var i = 123;
        System.out.println(i);
        System.out.print(s);
        int a = 1;
        a = --a - a--;
        System.out.println(a);
        int b = 18;
        //10010 bit
        //b = b << 1;
        System.out.println(b >> 1);
        // 10001 bit
        String g = "qwerewq"; // 
        boolean l = g.length() > 4 && g.charAt(3) > '1';
        System.out.println();
        System.out.println(l);
        
        int[] arr = new int[10];
        arr[3] = 10;
        System.out.println(arr[3]);
        double[] d;

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s! \n", name);
        iScanner.close();
        int c = a + i;
        String res = String.format("%d + %d = %d", a, i, c);
        System.out.printf("%d + %d = %d", a, i, c);
        System.out.println();
        System.out.println(res);
        switch (a) {
            case 1:
                c = 123;
                break;
        
            default:
                System.out.println("Ошибка");
                break;
        }
        
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }

    static String getType(Object o){
        return o.getClass() .getSimpleName();
    }
    
    
}