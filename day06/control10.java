package day06;

public class control10 {
    // while문 예제 1
    public static void main(String[] args) {
        int i = 5;
        while (i-- != 0) {
            System.out.println(i + " - I can do it.");
        }

    // while문 에제 1-1
        int sum = 0;
        i = 0;
        // i를 1씩 증가시켜 sum에 계속 더해나간다.
        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }


    }    
    
}
