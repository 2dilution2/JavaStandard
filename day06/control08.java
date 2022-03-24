package day06;

public class control08 {
    // for문 예제 1
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // i의 값을 출력한다.
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);    // print()를 쓰면 가로로 출력된다.
        }

        System.out.println();

    //  for문 예제 1-1
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
        }
    }
}
