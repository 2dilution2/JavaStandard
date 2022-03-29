package day09;

public class array09 {
    // 2차원 배열의 초기화 예제2
    public static void main(String[] args) {
        int[][] score = {
            {100, 100, 100},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40},
            {50, 50, 50}
        };
        
        // 과목의 총점
        int kortotal = 0, engtotal = 0, mathtotal = 0;

        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("==========================================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;        // 개인의 총점
            float aver = 0;    // 개인의 평균

            kortotal += score[i][0];
            engtotal += score[i][1];
            mathtotal += score[i][2];
            System.out.printf("%3d", i+1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            aver = sum /(float)score[i].length; // 평균 계산
            System.out.printf("%5d %5.1f%n", sum, aver);
        }
    }
}
