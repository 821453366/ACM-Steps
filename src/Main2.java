import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a + b);
        }
    }
}

