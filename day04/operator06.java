package day04;

public class operator06 {
    // 나머지 연산자
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.printf("%d 를 나누면 , %n", x,y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);

        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);
    
    }
}
