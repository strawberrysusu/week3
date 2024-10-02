import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 개의 숫자 입력받기
        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();

        System.out.print("세 번째 숫자: ");
        int num3 = sc.nextInt();

        // 가장 큰 수 찾기
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // 결과 출력
        System.out.println("가장 큰 수는: " + max);

        sc.close(); // 스캐너 자원 해제
    }
}


//### 문제 11: 3개의 숫자 중 가장 큰 수 찾기 (중첩 조건문 활용)
//
//`Question11.java`
//
//- **설명 :** 세 개의 숫자를 입력받고, 그 중에서 가장 큰 숫자를 출력하는 프로그램을 작성하세요.