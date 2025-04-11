import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tired = 0;

        System.out.println("피로도를 입력해주세요 : ");
        tired = sc.nextInt();

        if (tired < 90) {
            System.out.println("운동을 가야합니다.");
        }
        else {
            System.out.println("운동을 쉬어야 합니다.");
        }
    }
}