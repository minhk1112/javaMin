import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0부터 100 사이의 숫자를 입력해주세요: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (0 <= n && n <= 100) {
                System.out.println((n));
                break;
            }
                System.out.println(i);
        }
    }
}