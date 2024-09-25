import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 연도 입력받기
        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();

        // 윤년 여부 판단
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }

        sc.close(); // 스캐너 자원 해제
    }
}


//### 문제 6: if 문을 이용한 윤년 계산기
//
//`Question6.java`
//
//- **설명**: 사용자가 입력한 연도가 윤년인지 아닌지 판별하는 프로그램을 작성하세요.
//- **힌트**: 윤년의 조건은 다음과 같습니다.
//    - 연도가 4로 나누어떨어지고, 100으로 나누어떨어지지 않거나, 400으로 나누어떨어지는 경우 윤년입니다.

