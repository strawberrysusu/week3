import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 나이 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 나이가 18 이상인지 확인하여 성인 여부 출력
        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        sc.close(); // 스캐너 자원 해제
    }
}

//### 문제 5: if 문을 이용한 나이 계산 프로그램
//
//`Question5.java`
//
//- **설명**: 사용자로부터 나이를 입력받아, 18세 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다"를 출력하는 프로그램을 작성하세요.
