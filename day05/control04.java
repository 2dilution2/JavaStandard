package day05;

import java.util.Scanner;

public class control04 {
    public static void main(String[] args) {
        int score = 0;      // 점수를 저장하기위한 변수
        char grade = ' ';   // 학점을 저장하기위한 변수

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
        scanner.close();
    }
}
