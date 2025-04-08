import java.util.Scanner;

public class Cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int kor = 0, eng =0, mat =0, sci = 0;

        int sum = 0;
        int intAVG = 0;
        double doubleAVG= 0.0;
        boolean boolRslt = false;

        System.out.print("수학 점수를 입력하시오: ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하시오: ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하시오: ");
        mat = sc.nextInt();
        System.out.print("과학 점수를 입력하시오: ");
        sci = sc.nextInt();

        sum = kor + eng + mat + sci;
        intAVG = sum/4;
        doubleAVG = sum/4;
        boolRslt = intAVG == doubleAVG;
        System.out.println("합계. " + sum);
        System.out.println("정수 평균. " + intAVG);
        System.out.println("실수 평균. " + doubleAVG);
    }
}