import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            if (a == 0 && b == 0) {
                return ;
            }
            System.out.println(a + b);
        }
    }
}