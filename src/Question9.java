import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 숫자 입력받기
        System.out.print("첫 번째 숫자: ");
        double num1 = sc.nextDouble();

        // 두 번째 숫자 입력받기
        System.out.print("두 번째 숫자: ");
        double num2 = sc.nextDouble();

        // 연산자 입력받기
        System.out.print("연산자(+,-,*,/): ");
        String operator = sc.next();

        // 연산자에 따른 계산 수행
        if (operator.equals("+")) {
            System.out.println("결과: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("결과: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("결과: " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.println("결과: " + (num1 / num2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }

        sc.close(); // 스캐너 자원 해제
    }
}


//### 문제 9: if 문을 이용한 고급 계산기
//
//`Question9.java`
//
//- **설명**: 사용자가 입력한 연산자와 두 개의 숫자에 따라 사칙연산(+, -, *, /)을 수행하는 프로그램을 작성하세요. 단, 나눗셈의 경우 두 번째 숫자가 0일 때 "0으로 나눌 수 없습니다."라는 메시지를 출력하세요.
//- **힌트**: `if-else` 문을 사용하여 0으로 나누는 경우를 처리하세요.