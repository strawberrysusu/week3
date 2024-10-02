import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목별 점수 입력받기
        System.out.print("국어 점수: ");
        int korean = sc.nextInt();

        System.out.print("영어 점수: ");
        int english = sc.nextInt();

        System.out.print("수학 점수: ");
        int math = sc.nextInt();

        System.out.print("과학 점수: ");
        int science = sc.nextInt();


        // 평균 점수 계산
        double average = (korean + english + math + science) / 4.0;
        System.out.printf("평균 점수: %.2f\n", average);

        // 합격/불합격 판단
        if (average >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        sc.close(); // 스캐너 자원 해제
    }
}



//### 문제 12: 점수에 따른 등급 및 합격/불합격 판단
//
//`Question12.java`
//
//
//- 4개 과목의 점수를 각각 입력받은 후, 각 과목의 등급을 출력하고, 평균 점수를 구한 뒤 평균 점수가 60점 이상이면 "합격", 그렇지 않으면 "불합격"을 출력하는 프로그램을 작성하세요.
