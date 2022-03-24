package day02;

public class exchange {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x="+x);
        System.out.println("y="+y);

        // 두변수의 값을 바꾸는법

        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
