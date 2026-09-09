package exam;

import exam.util.InputUtil;


public class BmiCalculator {

    public static void main(String[] args) {
        while (true) {
            double height = InputUtil.getDouble("키를 입력하세요 (cm 또는 m): ");
            double weight = InputUtil.getDouble("몸무게(kg)를 입력하세요: ");

            double heightInMeters = height > 100 ? height / 100 : height;
            double bmi = weight / (heightInMeters * heightInMeters);

            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println("판정: " + getResult(bmi));

            String answer = InputUtil.getString("계속 하시겠습니까? (y/n): ");
            if (!answer.equals("y")) {
                break;
            }
            System.out.println();
        }

        System.out.println("프로그램을 종료합니다.");
    }

    private static String getResult(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi < 23) {
            return "정상";
        } else if (bmi < 25) {
            return "과체중";
        } else if (bmi < 30) {
            return "비만";
        }
        return "고도비만";
    }
}