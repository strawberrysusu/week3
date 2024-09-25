import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 월 입력받기
        System.out.print("월을 입력하세요(1~12): ");
        int month = sc.nextInt();

        // 월에 따른 계절 판별
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        sc.close(); // 스캐너 자원 해제
    }
}

//### 문제 7: switch 문을 이용한 계절 판별기
//
//`Question7.java`
//
//- **설명**: 월(1~12)을 입력받고, 해당 월에 맞는 계절을 출력하는 프로그램을 작성하세요.
//    - 12, 1, 2 → 겨울
//    - 3, 4, 5 → 봄
//    - 6, 7, 8 → 여름
//    - 9, 10, 11 → 가을