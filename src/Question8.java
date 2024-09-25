import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 키와 몸무게 입력받기
        System.out.print("키를 입력하세요(m): ");
        double height = sc.nextDouble();

        System.out.print("몸무게를 입력하세요(kg): ");
        double weight = sc.nextDouble();

        // BMI 계산
        double bmi = weight / (height * height);

        // BMI에 따른 상태 출력
        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 24.9) {
            System.out.println("정상");
        } else if (bmi < 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }

        sc.close(); // 스캐너 자원 해제
    }
}


//### 문제 8: if 문을 사용한 BMI 계산기
//
//`Question8.java`
//
//- **설명**: 사용자로부터 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, BMI에 따라 건강 상태를 출력하는 프로그램을 작성하세요.
//    - BMI = 몸무게(kg) / (키(m) * 키(m))
//    - BMI 18.5 미만: 저체중
//    - BMI 18.5 이상 24.9 이하: 정상
//    - BMI 25 이상 29.9 이하: 과체중
//    - BMI 30 이상: 비만