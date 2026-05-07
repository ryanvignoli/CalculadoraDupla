package operacoes;

import java.util.Scanner;

public class Potencia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.pow(x, y));
    }
}
