import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("잘못된 값 입니다.");
        }
    }
}
//### 문제 2: switch 문을 사용한 요일 출력
//
//`Question2.java`
//
//- **설명**: 숫자(1~7)를 입력받고, 그 숫자에 해당하는 요일을 출력하는 프로그램을 작성하세요. (1 = 월요일, 2 = 화요일, ...)
//- **힌트**: `switch` 문을 사용하세요.