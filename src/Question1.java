import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int number = scanner.nextInt(); // 사용자가 입력한 정수를 변수에 저장

        if (number % 2 == 0)
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");

        scanner.close(); // 스캐너 자원 해제
    }
}

//### 문제 1: if 문을 이용한 짝수/홀수 판별 프로그램
//
//`Question1.java`
//
//- **설명**: 사용자로부터 정수를 입력받고, 그 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
//- **힌트**: `if (number % 2 == 0)`는 짝수, 그렇지 않으면 홀수입니다.
