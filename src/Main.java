import java.util.Scanner;

public class Main {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");

        int score = scanner.nextInt();

        switch (score/10){
            case 10:
            case 9:
                System.out.println("학점은 A 입니다");
                break;

            case 8:
                System.out.println("학점은 B 입니다");
                break;

            case 7:
                System.out.println("학점은 C 입니다");
                break;

            case 6:
                System.out.println("학점은 D 입니다");
                break;

            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("점수 오류");
                System.exit(0);
        }
    }
}