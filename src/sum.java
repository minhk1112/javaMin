import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자를 입력해주세요");
        int n= scanner.nextInt();

        for(int i = 1; i <= n; i++){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println("1부터" + n +"까지 홀수의 합은" + sum + "입니다.");
    }
}
