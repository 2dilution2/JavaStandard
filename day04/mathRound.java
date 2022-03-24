package day04;

public class mathRound {
    // 반올림
    public static void main(String[] args) {
        double pi = 3.151592;
        double shortpi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortpi);
    }
}
