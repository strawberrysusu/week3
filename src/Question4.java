import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 숫자 입력
        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();

        // 연산자 입력
        System.out.print("연산자(+,-,*,/): ");
        String operator = sc.next();

        // 결과 출력
        switch (operator) {
            case "+":
                System.out.println("결과: " + (first + second));
                break;
            case "-":
                System.out.println("결과: " + (first - second));
                break;
            case "*":
                System.out.println("결과: " + (first * second));
                break;
            case "/":
                // 0으로 나누는 경우 예외 처리
                if (second != 0) {
                    System.out.println("결과: " + ((double) first / second));
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }

        sc.close(); // 스캐너 자원 해제
    }
}

//### 문제 4: switch 문을 사용한 계산기
//
//`Question4.java`
//
//- **설명**: 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
//- **힌트**: `switch` 문을 사용하여 연산자를 처리하세요.