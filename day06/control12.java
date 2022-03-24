package day06;

import java.util.*;

public class control12 {
    // do-while문
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer =(int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("1과 100사이의 정수를 입력 하세요.>");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은수로 다시 시도하세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도하세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
        scanner.close();
    }
}
