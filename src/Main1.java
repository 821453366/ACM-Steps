
import java.util.Scanner;
public class Main1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int a = input.nextInt();
            int b[] = new int[a];
            int num[] = new int[a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 2; j++) {
                    num[i] += input.nextInt();
                }
            }
            for (int i = 0; i < a; i++) {
                System.out.println(num[i]);
            }
        }
    }
}
