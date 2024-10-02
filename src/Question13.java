import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 개의 숫자 입력받기
        System.out.print("첫 번째 숫자: ");
        double num1 = sc.nextDouble();

        System.out.print("두 번째 숫자: ");
        double num2 = sc.nextDouble();

        System.out.print("세 번째 숫자: ");
        double num3 = sc.nextDouble();

        // 두 개의 연산자 입력받기
        System.out.print("첫 번째 연산자(+,-,*,/): ");
        String op1 = sc.next();

        System.out.print("두 번째 연산자(+,-,*,/): ");
        String op2 = sc.next();

        double result;

        // 첫 번째 연산자와 두 번째 연산자 우선순위에 따라 계산
        if (op1.equals("*") || op1.equals("/")) {
            // 첫 번째 연산자가 우선순위가 높으면 먼저 계산
            result = calculate(num1, num2, op1);
            result = calculate(result, num3, op2);
        } else if (op2.equals("*") || op2.equals("/")) {
            // 두 번째 연산자가 우선순위가 높으면 두 번째 연산자 먼저 계산
            double tempResult = calculate(num2, num3, op2);
            result = calculate(num1, tempResult, op1);
        } else {
            // 두 연산자가 모두 우선순위가 낮으면 순서대로 계산
            result = calculate(num1, num2, op1);
            result = calculate(result, num3, op2);
        }

        // 결과 출력
        System.out.println("결과: " + result);

        sc.close(); // 스캐너 자원 해제
    }

    // 두 숫자와 연산자를 받아 계산하여 결과를 반환하는 메서드
    public static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
            default:
                System.out.println("잘못된 연산자 입니다.");
                return 0;
        }
    }
}



//### 문제13: 우선순위를 구현한 계산기
//
//`Question13.java`
//
//**설명**:
//
//- 세 개의 숫자와 연산자(+, -, *, /)를 입력받아 * , / 연산자를 먼저 계산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
//- if 문을 사용 하지 말고 switch 문으로만 작성하세요.