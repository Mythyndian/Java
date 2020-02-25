import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        for (int i = 0; i <= 100; i++) {
            if (x == i) {
                System.out.println(x);
            }

            if (y == i) {
                System.out.println(y);
            }

            if (z == i) {
                System.out.println(z);
            }
        }
    }
}
